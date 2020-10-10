package cn.itcast;

import java.io.OutputStream;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{
    
	 public void service(ServletRequest req, ServletResponse res)throws ServletException,java.io.IOException {

        OutputStream out=res.getOutputStream();
		 out.write("hello servlet!!!".getBytes());
    }	 
}
