package cn.itcast.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo2 {

	/*
	 *连接数据库，得到connection就算成功 
	 */
	
	@Test
	public void func1() throws ClassNotFoundException, SQLException{
		
		/**
		 * 一、得到Connection
		 */
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testjdbc";
		String username="root";
		String password="admin";
		
		Class.forName(driverClassName);
		Connection conn=DriverManager.getConnection(url,username,password);
		
		/*
		 *二、 对数据库做增、删、改
		 *1.通过Connection对象创建Statement
		 *Statement语句的发送器，它的功能就是向数据库发送sql语句
		 *2.调用它的int exxcuteUpdate(String sql)
		 */
		
		//1.通过Connection得到Statement对象
		Statement stmt=conn.createStatement();
		//2.使用Statement发送sql语句
		//String sql="INSERT INTO student VALUES('03','王五',33,'女')";
		String sql="UPDATE student SET name='赵六' where number='03'";
		int r=stmt.executeUpdate(sql);
		System.out.println(r);
		
	}
	/**
	 * 执行查询
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	@Test
	public void fun2() throws ClassNotFoundException, SQLException{
		/**
		 * 1.得到Connection
		 * 2.得到Statement,发送select语句
		 * 3.对查询返回的"表格"进行解析
		 */
		
		/*
		 * 一、得到连接
		 * 1.准备四大连接参数
		 */
		String driverClassName="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testjdbc";
		String username="root";
		String password="admin";
		
		/**
		 * 2.加载驱动类
		 */
		  Class.forName(driverClassName);
		
		/**
		 * 3.通过以下的三个参数调用DriverManager的getConnection(),得到连接
		 */
		Connection conn=DriverManager.getConnection(url, username, password);
		
		/*
		 * 二、得到Statement,执行select语句。
		 * 1.得到Statement对象：Conntion的createStatement()方法
		 */
		Statement stmt=conn.createStatement();
		
		/*
		 * 2.调用Statement的RestultSet rs=executeQuery(String querySql);
		 */
		ResultSet rs=stmt.executeQuery("select * from student");
		
		/*
		 * 三、解析ResultSet
		 * 1.把行光标移动到第一行，并判断下一行是否存在！
		 */
		
		while(rs.next()){
			int stuNo=rs.getInt(1);     //通过列编号获取该列值
			String stuName=rs.getString("name");  //通过列名称来获取该列的值
			System.out.println(stuNo+" "+stuName);
		}
		
		/**
		 * 四、关闭资源
		 * 倒关
		 */
		rs.close();
		stmt.close();
		conn.close();   //这个东东，必须要关，不关就死！
	}
	
	/*
	 * 规范化
	 */
	@Test
	public void fun3() throws Exception{
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			/**
			 * 一、得到Connection
			 */
			String driverClassName = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/testjdbc";
			String username = "root";
			String password = "admin";
			Class.forName(driverClassName);
		    conn = DriverManager.getConnection(url, username,password);
		    
		    /*
		     * 二、创建statement
		     */
		    
		    stmt=conn.createStatement();
		    String sql="select * from student";
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
