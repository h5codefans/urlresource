package cn.itcast.response;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//在servlet中用OutputStream输出中文的问题
public class ResponseDemo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		test1(response);
	}



	public void test2(HttpServletResponse response) throws IOException,
			UnsupportedEncodingException {
		// html： <meta>标签模拟一个http响应头,来控制浏览器的行为
		String data = "中国";
		OutputStream out = response.getOutputStream();

		out.write("<meta http-equiv='content-type' content='text/html;charset=utf-8'>".getBytes());
		out.write(data.getBytes("utf-8"));
	}

	public void test1(HttpServletResponse response) throws IOException,
			UnsupportedEncodingException {
		// 程序以什么码表输出了，程序一定要控制浏览器以什么码表打开
	    response.setHeader("content-type", "text/html;charset=UTF-8");
		String data = "中国";
		OutputStream out = response.getOutputStream();
		// out.write(data.getBytes());
		out.write(data.getBytes("UTF-8"));
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
