package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;


public class Demo1 {

	@Test
	public void fun1() throws ClassNotFoundException, SQLException{
		
		/**
		 * jdbc四大配置参数：
		 * driverClassName:com.mysql.jdbc.Driver
		 * url:jdbc:mysql//localhost:3306/testjdbc
		 * username:root
		 * password::admin
		 */
		
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/testjdbc";
		String username="root";
		String password="admin";
		
		Connection conn= DriverManager.getConnection(url, username, password);
	    System.out.println(conn);
	}
}
	