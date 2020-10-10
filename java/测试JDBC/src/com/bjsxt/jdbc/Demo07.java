package com.bjsxt.jdbc;

import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

//测试时间出来(java.sql.Date,Time,Timestamp)
public class Demo07 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
             
            for(int i=0;i<5;i++){
    		    ps=conn.prepareStatement("insert into t_user (username,pwd,regTime,lastLoginTime) value(?,?,?,?)");   
                ps.setObject(1, "高淇"+i);
                ps.setObject(2, "13234");
                
                int rand=1000000000+new Random().nextInt(1000000000);
                Date date=new java.sql.Date(System.currentTimeMillis()-rand);
                Timestamp stamp=new Timestamp(System.currentTimeMillis()-rand);//如果需要指定日期，可以使用Calender,DateFormat
                ps.setDate(3,date);
                ps.setTimestamp(4, stamp);
                ps.execute();
            }

            System.out.println("插入一个用户，高淇");
            
           
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
