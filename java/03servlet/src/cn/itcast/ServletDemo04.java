package cn.itcast;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//servletConfig对象，用于封装servlet的配置信息
//在实际开发中，有一些东西不适合在servlet程序中写死，这类数据可以通过配置方式配给servlet，例如：
//servlet采用哪个码表，servlet连接哪个数据库，servlet哪个配置文件
public class ServletDemo04 extends HttpServlet {

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//得到指定的
		String value=this.getServletConfig().getInitParameter("data");
		System.out.println(value);
		
		//得到所有的
		Enumeration e=this.getServletConfig().getInitParameterNames();
		while(e.hasMoreElements()){
			String name=(String) e.nextElement();
			String value1=this.getServletConfig().getInitParameter(name);
			System.out.println(name+"="+value1);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


    
}
