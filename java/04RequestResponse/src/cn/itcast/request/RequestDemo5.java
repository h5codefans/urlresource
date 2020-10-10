package cn.itcast.request;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//请求转发，以及使用request域对象把数据带给转发资源
//请求转发的特点：
//1.客服端只发过一次请求，二服务器端有多个资源调用
//2.客户机浏览器地址栏没有变化
public class RequestDemo5 extends HttpServlet {
    
	
	//mvc  (model javaben   v view(jsp)          c(cotroler(servlet)        )
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String data="aaaaaaa";
		request.setAttribute("data", data);
		//request也可以与实现转发
		request.getRequestDispatcher("/message1.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
