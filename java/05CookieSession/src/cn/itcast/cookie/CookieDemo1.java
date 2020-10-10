package cn.itcast.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<a href='/05CookieSession/CookieDemo2'>清除上次访问cookie</a><br/>");
		out.print("上次访问时间：");
		Cookie cookies[]=request.getCookies();
		for(int i=0;cookies!=null && i<cookies.length;i++){
			if(cookies[i].getName().equals("lastAccessTime")){
				long cookieValue=Long.parseLong(cookies[i].getValue());
				Date date=new Date(cookieValue);
				out.print(date.toLocaleString());
			}
		}
		
		Cookie cookie=new Cookie("lastAccessTime",System.currentTimeMillis()+"");
		cookie.setMaxAge(3600);// 以秒为单位
		cookie.setPath("/05CookieSession");
		response.addCookie(cookie);

	}

}
