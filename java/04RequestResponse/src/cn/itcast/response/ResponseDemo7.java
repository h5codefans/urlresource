package cn.itcast.response;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//实现请求重定向
/*
 重定向的特点：
 1.浏览器会向服务器发送两次请求，意味着就要2个request/response
 2.用重定向技术，浏览器地址栏会发生变化
 
  用户登录和显示购物车是，通常会用到重定向技术
 */
public class ResponseDemo7 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		response.setStatus(302);
		response.setHeader("location", "/04RequestResponse/index.jsp");
	    */
		response.sendRedirect("/04RequestResponse/index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
