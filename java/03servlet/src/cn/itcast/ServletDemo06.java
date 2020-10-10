package cn.itcast;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * servletContext域：
 * 1.这是一个容器
 * 2.servletContext域这句话说明了这个容器的作用范围，也就是应用程序的范围
 * @author Administrator
 *
 */

//通过servletContext实现ServletDemo06和ServletDemo07的数据共享
public class ServletDemo06 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data="aaaa";
		
		this.getServletContext().setAttribute("a",data);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      doGet(request, response);
	}

}
