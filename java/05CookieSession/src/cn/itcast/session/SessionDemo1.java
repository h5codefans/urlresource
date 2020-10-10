package cn.itcast.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//购买
public class SessionDemo1 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		String sessionid=session.getId();
		Cookie cookie=new Cookie("JSESSIONID", sessionid);
		cookie.setPath("/05CookieSession");
		cookie.setMaxAge(30*60);
		response.addCookie(cookie);
		session.setAttribute("name", "洗衣机");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
