package cn.itcast.response;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//通过浏览器定时刷新
public class ResponseDemo5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           test3(request, response);
	}
    
	//实用的自动跳转技术
	public void test3(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	    
		String message="<meta http-equiv='refresh' content='3;url=/04RequestResponse/index.jsp'>恭喜你，登录成功，本浏览器将在3秒后，调转到首页，如何没有调转，请点击<a href=''>超链接</a>";
        this.getServletContext().setAttribute("message", message);
        this.getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	}
	public void test2(HttpServletResponse response) throws IOException {
		//假设这是一个用于处理登录的servlet
		
		//假设程序运行到此，用户登录成功了
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("refresh", "3;url='/04RequestResponse/index.jsp'");
		response.getWriter().write("恭喜你，登录成功，本浏览器将在3秒后，调转到首页，如何没有调转，请点击<a href=''>超链接</a>");
	}

    
	public void test1(HttpServletResponse response) throws IOException {
		response.setHeader("refresh", "3");
		
		String data=new Random().nextInt(100000)+"";
		response.getWriter().write(data);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
