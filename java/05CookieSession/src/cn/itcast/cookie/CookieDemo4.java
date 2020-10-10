package cn.itcast.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//显示商品详细信息的servlet
public class CookieDemo4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		//根据用户带过来的id,显示相应的商品的详细信息
		String id=request.getParameter("id");
		Book book=(Book) Db.getAll().get(id);
		
		out.write(book.getId()+"<br/>");
		out.write(book.getAuthor()+"<br/>");
		out.write(book.getName()+"<br/>");
		out.write(book.getDecription()+"<br/>");
		
		
		//2.构建cookie，会写给浏览器
		String cookieValue=builderCookie(id,request);
		Cookie cookie=new Cookie("bookHistory",cookieValue);
		cookie.setMaxAge(1*30*24*3600);
		cookie.setPath("/05CookieSession");
		response.addCookie(cookie);
		
	}


	private String builderCookie(String id, HttpServletRequest request) {
		
		//bookHistory =null   1    1
				//bookHistory=2,5,1   1    1,2,5
				//bookHistory=2,5,4   1    1,2,5
				//bookHistroy=2,5     1    1,2,5   // 假如列表最多3个
				String bookHistroy=null;
				Cookie cookies[]=request.getCookies();
				for(int i=0;cookies!=null && i<cookies.length;i++){
					if(cookies[i].getName().equals("bookHistory")){
						bookHistroy=cookies[i].getValue();				
					}
				}
				if(bookHistroy==null)
					return id;
				//if(bookHistroy.contains(id))不能这样  21,23 也包括1
				List<String> list=Arrays.asList(bookHistroy.split("\\,"));
				LinkedList <String>linkedlist=new LinkedList<String>(list);
				if(list.contains(id)){
					linkedlist.remove(id);
					linkedlist.addFirst(id);
				}else{
					if(list.size()>=3){
						linkedlist.removeLast();
						linkedlist.addFirst(id);
					}else
						linkedlist.addFirst(id);
				}
				StringBuffer sb=new StringBuffer();
				for(String bid : linkedlist){
					sb.append(bid+",");
				}
				return sb.deleteCharAt(sb.length()-1).toString();		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
