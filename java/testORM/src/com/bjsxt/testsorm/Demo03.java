package com.bjsxt.testsorm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试使用Javabean来封装一条记录
 * 使用List<javabean>存储多条记录
 * @author Administrator
 *
 */
public class Demo03 {
	
	 public static void test01(){
			Connection conn=JDBCUtil.getMysqlConn();
			PreparedStatement ps=null;
			ResultSet rs=null;
			Emp emp=null;
			Map<String, Object> row=new HashMap<String, Object>();//使用一个Map封装一条记录
			try {
				ps=conn.prepareStatement("select empname,salary,age from emp where id=?");
				ps.setObject(1, 1);
				rs=ps.executeQuery();
				
				while(rs.next()){
					//System.out.println(rs.getString(1)+"--"+rs.getDouble(2)+"--"+rs.getInt(3));
	               emp=new Emp(rs.getString(1),rs.getDouble(2),rs.getInt(3));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JDBCUtil.close(rs, ps, conn);
			}
			
			System.out.println(emp.getEmpnaem()+"--"+emp.getSalary()+"--"+emp.getAge());
	 }
	 
	 public static void test02(){
			Connection conn=JDBCUtil.getMysqlConn();
			PreparedStatement ps=null;
			ResultSet rs=null;
			List<Emp> list=new ArrayList<Emp>();//使用一个Map封装一条记录
			try {
				ps=conn.prepareStatement("select empname,salary,age from emp where id>?");
				ps.setObject(1, 1);
				rs=ps.executeQuery();
				
				while(rs.next()){
					//System.out.println(rs.getString(1)+"--"+rs.getDouble(2)+"--"+rs.getInt(3));
                    Emp emp=new Emp(rs.getString(1),rs.getDouble(2),rs.getInt(3));
	                
                    list.add(emp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				JDBCUtil.close(rs, ps, conn);
			}
			
			//遍历List,就是遍历这一行的多列信息
			for(Emp emp:list){
				System.out.println(emp.getEmpnaem()+"--"+emp.getSalary()+"--"+emp.getAge());
			}
	 }
	 
     public static void main(String[] args) {
         
    	 test02();
	}
}
