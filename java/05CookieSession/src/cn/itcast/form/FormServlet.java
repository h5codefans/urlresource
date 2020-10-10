package cn.itcast.form;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.tribes.membership.StaticMember;
import org.omg.CORBA.PRIVATE_MEMBER;

import sun.misc.BASE64Encoder;

//产生表单
public class FormServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//参数随机数(表单号)
		TokenProcessor tp=TokenProcessor.getInstance();
		String token=tp.generateToken();
		
		request.getSession().setAttribute("token", token);
		request.getRequestDispatcher("/form.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

class TokenProcessor{   //令牌
	/*
	 * 单例
	 * 1.把构造方式私有
	 * 2.自己创建一个
	 * 3.对外暴露一个方法，允许获取上面创建的对象
	 * 
	 */
	private TokenProcessor(){}
    private static final TokenProcessor instance=new TokenProcessor();
	
    public static TokenProcessor getInstance(){
    	return instance;
    }
    
    public String generateToken(){
    	String token=System.currentTimeMillis()+new Random().nextInt()+"";
    	
    	try {
			MessageDigest md=MessageDigest.getInstance("md5");
			byte[] md5=md.digest(token.getBytes());
			
			//base64编码  
			BASE64Encoder encoder=new BASE64Encoder();
			return encoder.encode(md5);
			
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
    	
    }
}
