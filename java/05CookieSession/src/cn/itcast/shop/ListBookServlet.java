package cn.itcast.shop;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//代表网站首页
public class ListBookServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		request.getSession();
		
		out.print("本网站有如下商品：<br/>");
		Map<String, Book> map=Db.getAll();
		for(Map.Entry<String,Book> entry:map.entrySet()){
			 Book book=entry.getValue();
			 String url=response.encodeURL("/05CookieSession/BuyServlet?id="+book.getId());
			 out.write(book.getName()+"<a href='"+url+"' target='_blank'>购买</a><br/>");
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}


class Db{
	 private static Map<String,Book> map=new LinkedHashMap();
	 static{
		 map.put("1", new Book("1","javaweb开发","老张","一本好书"));
		 map.put("2", new Book("2","jdbc开发","老张","一本好书"));
		 map.put("3", new Book("3","spring开发","老黎","一本好书"));
		 map.put("4", new Book("4","structs开发","老毕","一本好书"));
		 map.put("5", new Book("5","android开发","老黎","一本好书"));
	 }
	 
	 public static Map getAll(){
		 
		 return map;
	 }
}

class Book implements Serializable{
	private String id;
	private String name;
	private String author;
	private String decription;
	
	public Book() {
		
	}
	
	public Book(String id, String name, String author, String decription) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.decription = decription;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	
}
