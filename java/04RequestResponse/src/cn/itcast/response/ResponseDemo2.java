package cn.itcast.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//通过response的writer流量输出数据的问题
public class ResponseDemo2 extends HttpServlet {



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test1(response);
	}

	public void test1(HttpServletResponse response) throws IOException {
		//设置response使用的码表，以控制response以什么码表向浏览器写出数据
		response.setCharacterEncoding("UTF-8"); 
		//指定浏览器以什么码表打开服务器发送的数据
		response.setHeader("content-type", "text/html;charset=UTF-8");
		String data="中国";
		 PrintWriter out=response.getWriter();
		 out.write(data);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
