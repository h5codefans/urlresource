package cn.itcast.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//下载文件
public class ResponseDemo3 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		  String path=this.getServletContext().getRealPath("/download/妹子.jpg");
		  String filename=path.substring(path.lastIndexOf("\\")+1);
		  
		  InputStream in=null;
		  OutputStream out=null;
		//如果下载文件是中文文件，则文件名需要经过url编码
		 response.setHeader("content-disposition","attachment;filename="+URLEncoder.encode(filename,"utf-8"));
		
		  try {
			in = new FileInputStream(path);
			int len=0;
			byte butffer[]=new byte[1024];
		    out=response.getOutputStream();
			while((len=in.read(butffer))>0){
				out.write(butffer, 0, len);
			}
		} finally{
			if(in!=null){
				try{
					in.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		  
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doGet(request, response);
	}

}
