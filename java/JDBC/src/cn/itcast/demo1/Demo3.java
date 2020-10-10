package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class Demo3 {

	@Test
	public void fun3() throws Exception{
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			/**
			 * 一、得到Connection
			 */
			String driverClassName = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "stx9";
			String password = "stx9";
			Class.forName(driverClassName);
		    conn = DriverManager.getConnection(url, username,password);
		    
		    /*
		     * 二、创建statement
		     */
		    
		    stmt=conn.createStatement();
		    String sql="select * from tbl_user";
		    rs=stmt.executeQuery(sql);
		    
		    /*
		     *三、循环遍历rs,打印其中数据 
		     */
		    
		    while(rs.next()){
		    	System.out.println(rs.getObject(1));
		    }
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			//关闭
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}
		
	}
}
