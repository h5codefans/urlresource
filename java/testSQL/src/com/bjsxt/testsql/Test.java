package com.bjsxt.testsql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
    public static void main(String[] args) {
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:5555;DatabaseName=sample";
		String userName="sa";
		String userPwd="admin";
		
		Connection dbConn=null;
		
		try {
			Class.forName(driverName);
			dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			
			System.out.println("Connection Successful!");
		} catch (Exception e) {
     		e.printStackTrace();
		} 
	}
}
