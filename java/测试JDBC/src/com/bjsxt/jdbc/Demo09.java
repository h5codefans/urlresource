package com.bjsxt.jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Clob;
/**
 * 测试CLOB  文本大对象的使用
 * 包含：将字符串、文件内容插入数据库中的CLOB字段、将CLOB字段取出来的操作
 * @author Administrator
 *
 */



public class Demo09 {

	public static void main(String[] args) throws IOException {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Reader r=null;
		try {
		    //加载类驱动
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","admin");
              
  
            ps=conn.prepareStatement("insert into t_user (username,myinfo) values(?,?)");
            
//            ps.setString(1, "高淇");
//            //ps.setClob(2, new FileReader(new File("f:/mycode/a.txt")));    //将文本文件内容直接输入到数据库中
//            
//            ps.setClob(2, new BufferedReader(new InputStreamReader(new ByteArrayInputStream("aaaaaabbbb".getBytes()))));
//            ps.executeUpdate();
            
             ps=conn.prepareStatement("select * from t_user where id=?");
             ps.setObject(1, 2);
             
             rs=ps.executeQuery();
             while(rs.next()){
            	 Clob c=rs.getClob("myinfo");
            	 r=c.getCharacterStream();
            	 int temp=0;
            	 while((temp=r.read())!=-1){
            		 System.out.print((char)temp);
            	 }
             }

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if (r != null) {
					r.close();
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
