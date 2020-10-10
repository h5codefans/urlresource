package com.bjsxt.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

//测试执行SQL语句，以及SQL注入问题
public class Demo02 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
			//建立连接(连接对象内部其实包含了Socket对象，是一个远程的连接。比较耗时！这是Connection对象管理的一个要点！)
			//正真开发中，为了提高效率，都会使用连接池来管理对象！
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
 
			stmt=conn.createStatement();
//			String sql="insert into t_user (username,pwd,regTime) values ('赵六',6666,now())";
//			stmt.execute(sql);
			
//			//测试SQL	注入
//			String id="5 or 1=1";
//			String sql="delete from t_user where id=+id";
//			stmt.execute(sql);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
