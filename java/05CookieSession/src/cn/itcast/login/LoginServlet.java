package cn.itcast.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
        List<User> list=DB.getAll();
        for(User user:list){
        	if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
        		request.getSession().setAttribute("user", user);    //登录成功向session中存入一个登录标记
        		response.sendRedirect("/05CookieSession/index.jsp");
        		return ;
        	}
        }
        
        out.write("用户名或密码不得!!");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

class DB{
	
	public static List list=new ArrayList();
	static{
		list.add(new User("aaa","123"));
		list.add(new User("bbb","123"));
		list.add(new User("ccc","123"));

	}
	
	public static List getAll(){
		return list;
	}
}