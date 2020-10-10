package cn.itcast;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//读取资源文件
public class ServletDemo10 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test4();
		
	}
    
	//通过servletContext的getRealPath得到绝对路径后，再通过传统流读取资源文件
	private void test4() throws IOException {
		String path=this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		String filename=path.substring(path.lastIndexOf("\\")+1);
		
		System.out.println("当前读取的资源名称是："+filename);
		
		FileInputStream in=new FileInputStream(path);
		
		Properties props=new Properties();
		props.load(in);
		
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		
		System.out.println("当前读取的资源数据是：");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	private void test3() throws IOException {
		InputStream in=this.getServletContext().getResourceAsStream("/db.properties");
		Properties props=new Properties();
		props.load(in);
		
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	private void test2() throws IOException {
		InputStream in=this.getServletContext().getResourceAsStream("/WEB-INF/classes/cn/itcast/db.properties");
		Properties props=new Properties();
		props.load(in);
		
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	private void test1() throws IOException {
		InputStream in=this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		Properties props=new Properties();
		props.load(in);
		
		String url=props.getProperty("url");
		String username=props.getProperty("username");
		String password=props.getProperty("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
