package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//测试批处理方法
public class Demo05 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
            
		    conn.setAutoCommit(false);     //设为手动提交
		    long start=System.currentTimeMillis();
		    stmt=conn.createStatement();
		    
		    for(int i=0;i<20000;i++){
		    	stmt.addBatch("insert into t_user (username,pwd,regTime) values ('gao"+i+"',66666,now())");
		    }
			
		    stmt.executeBatch();
		    conn.commit();    //提交事务
		    long end=System.currentTimeMillis();
		    System.out.println("插入20000条数据，耗时(毫秒):"+(end-start));
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
