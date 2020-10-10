package com.bjsxt.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;



public class Demo {
	
	public static void main(String[] args){
		Connection conn=null;
		PreparedStatement ps=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
			
			
			ps=conn.prepareStatement("insert into student(number,name,age,gender) values(?,?,?,?)");
			
			ps.setString(1, "04");
			ps.setString(2,"李四");
			ps.setInt(3,25);
			ps.setString(4, "男");
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(ps!=null){
					ps.close();
				}
			}catch(Exception e){
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
