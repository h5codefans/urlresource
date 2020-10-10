package cn.itcast;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//通过servletContext实现请求转发
public class ServletDemo09 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String data="aaaaaaaa";
		//把数据带给1.jsp  (不能通过context域，要通过request域）
		this.getServletContext().setAttribute("data", data);
		
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/1.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
