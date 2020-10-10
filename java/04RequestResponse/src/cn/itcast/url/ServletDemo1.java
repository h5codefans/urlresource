package cn.itcast.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo1 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.
		request.getRequestDispatcher("form.html").forward(request, response);
	   //2.
		response.sendRedirect("/04RequestResponse/form.html");
		//3.
		this.getServletContext().getRealPath("/form.html");
		//4.
		this.getServletContext().getResourceAsStream("/public/foot.jsp");
	    //5.
		/*
		   <a href="/04RequestResponse/form.hmtl">点点</a>
		   
		   <form action="/04RequestResponse/form.html">
		   
		   </form>
		 */
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
