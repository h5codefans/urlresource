package cn.itcast.form;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//处理表单提交请求
public class DoFormServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
/*		String username=request.getParameter("username");
	    
		try {
			Thread.sleep(1000 * 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("向数据库中注册用户~~~~");*/
		
		boolean b=isTokenValid(request);
		if(!b){
			System.out.println("请不要重复提交");
			return ;
		}
		request.getSession().removeAttribute("token");
		System.out.println("向数据库中注册用户~~~~");
		
	}
   
    //判断表单号是否有效
	private boolean isTokenValid(HttpServletRequest request) {
		
		String client_token=request.getParameter("token");
		if(client_token==null){
			return false;
		}
	    String server_token=(String) request.getSession().getAttribute("token");
	    if(server_token==null){
	    	return false;
	    }
	    if(!client_token.equals(server_token)){
	    	return false;
	    }
		return true;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doGet(request, response);	
	}

}
