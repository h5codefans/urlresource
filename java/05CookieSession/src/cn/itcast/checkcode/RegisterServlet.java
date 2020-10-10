package cn.itcast.checkcode;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		//处理注册请求之前，校验认证码是否有效
		String c_checkcode=request.getParameter("checkcode");
		String s_checkcode=(String) request.getSession().getAttribute("checkcode");
		if(c_checkcode!=null&&s_checkcode!=null&&c_checkcode.equals(s_checkcode)){
			System.out.println("处理注册请求");
		}else{
			System.out.println("认证码错误");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
