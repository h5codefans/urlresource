package com.bjsxt.jdbc;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;

//测试Statement接口用法，执行SQL语句，以及SQL注入问题
public class Demo03 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
            
			String sql="insert t_user (username,pwd,regTime) values(?,?,?)";   //?占位符
			ps=conn.prepareStatement(sql);   
//			ps.setString(1, "高淇");        //参数索引是从1开始计时，而不是0
//			ps.setString(2, "123456");
//			ps.setDate(3, new Date(System.currentTimeMillis()));
			
			//可以使用setObject处理参数
			ps.setObject(1, "高淇2");
			ps.setObject(2, "2343534");
			ps.setObject(3, new Date(System.currentTimeMillis()));
			System.out.println("插入一行计时");
//			ps.execute();
			int count=ps.executeUpdate();
			System.out.println(count);

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if (ps != null) {
					ps.close();
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
