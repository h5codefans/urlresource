package cn.itcast.shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//完成购买
public class BuyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		Book book=(Book) Db.getAll().get(id);
		
		HttpSession session=request.getSession(false);
		//手工以cookie形式发sessionid，以解决关闭浏览器后，上次买的东西还在
		//从session得到用户用于保护所有书的集合(购物车)
		List list=(List) session.getAttribute("list");
		if(list==null){
			list=new ArrayList();
		    session.setAttribute("list", list);	
		}
		list.add(book);
		
		//request.getRequestDispatcher("/ListCarServlet").forward(request, response);
	    //request.getContextPath()   //返回05CookieSession
		
		String url=response.encodeRedirectURL(request.getContextPath()+"/ListCarServlet");
		
		response.sendRedirect(url);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
