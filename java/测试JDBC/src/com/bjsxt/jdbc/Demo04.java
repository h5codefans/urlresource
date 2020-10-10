package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//测试ResultSet结果集的基本用法
public class Demo04 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
            
			String sql="select id,username,pwd from t_user where id>?";   //?占位符
		    ps=conn.prepareStatement(sql);   
            
			ps.setObject(1, 2);   //把id大于2的记录都取出来
			rs=ps.executeQuery();
            
			while(rs.next()){
				System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"---"+rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			//遵循：resultset-->statement-->connection这样的关闭顺序！一定要将三个try-catch块分开写
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
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
