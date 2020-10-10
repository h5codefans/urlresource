package cn.itcast.request;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RequestDemo4 extends HttpServlet {	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //test3(request,response);
		test2(request);
	}
    //测试题
	public void test3(HttpServletRequest request,HttpServletResponse response)
			throws IOException {
		request.setCharacterEncoding("UTF-8");
		String username=request.getParameter("username");
		
		response.setCharacterEncoding("gb2312");
		response.setContentType("text/html;gb2312");
	    response.getWriter().write(username);
	}
	
    //解决get提交的乱码(手工处理)
	public void test1(HttpServletRequest request)
			throws UnsupportedEncodingException {
		String username=request.getParameter("username");
		username=new String(username.getBytes("iso8859-1"),"UTF-8");
		System.out.println(username);
	}

    //解决post提交的乱码
	public void test2(HttpServletRequest request)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("UTF-8");  //只对post提交有效
		String username=request.getParameter("username");
		System.out.println(username);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
