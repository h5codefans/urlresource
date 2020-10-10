package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//测试时间出来(java.sql.Date,Time,Timestamp),取出指定时间段的数据
public class Demo08 {
	/**
	 * 将字符串代表的日期转为long数字(格式：yyyy-MM-dd hh:mm:ss)
	 * @param datestr
	 * @return
	 */
	public static long str2Date(String dateStr){
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return format.parse(dateStr).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
			return 0;
		}
	}
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
              
            ps=conn.prepareStatement("select * from t_user where regTime>? and regTime<?");
            
//            java.sql.Date start=new java.sql.Date(str2Date("2015-4-19 1:23:46"));
//            java.sql.Date end=new java.sql.Date(str2Date("2015-4-21 23:23:46"));
//            ps.setObject(1, start);
//            ps.setObject(2, end);
            
            ps=conn.prepareStatement("select * from t_user where lastLoginTime>? and lastLoginTime<? order by lastLoginTime desc");
            Timestamp start=new Timestamp(str2Date("2015-4-22 24:10:21"));
            Timestamp end=new Timestamp(str2Date("2015-4-23 9:9:21"));
            ps.setObject(1, start);
            ps.setObject(2, end);
            
            rs=ps.executeQuery();
            while(rs.next()){
            	System.out.println(rs.getInt("id")+"--"+rs.getString("username")+"--"+rs.getString("regTime")+"--"+rs.getTimestamp("lastLoginTime"));
            }
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
