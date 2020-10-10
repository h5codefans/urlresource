package com.bjsxt.others.pro;

import java.util.Properties;

/**
 * Properties 资源配置文件的读写
 * 1.key与value 只能为字符串
 * 2.存储于读取
 * setProperty(String key, String value) 
 * getProperty(String key, String defaultValue) 
 * @author Administrator
 *
 */
public class Demo01 {
   public static void main(String[] args){
	   //创建对象
	   Properties pro=new Properties();
	   //存储
	   pro.setProperty("driver","oracle.jdbc.driver.OracleDriver");
	   //pro.setProperty("url","jdbc:oracle:thin:@localhost:1521:orcl");
	   pro.setProperty("user","scott");
	   pro.setProperty("pwd","tiger");
	   
	   //获取
	   String url=pro.getProperty("url","test");
	   System.out.println(url);
   }
}
