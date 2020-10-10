package com.bjsxt.others.pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件：
 * 使用相对于绝对路径读取
 *load(InputStream inStream) 
 *load(Reader reader) 
 *loadFromXML(InputStream in) 
 * @author Administrator
 *
 */
public class Demo03 {
   public static void main(String[] args) throws FileNotFoundException, IOException{
	   Properties pro=new Properties();
	   //读取  绝对路径
	   //pro.load(new FileReader("f:/mycode/db.properties"));
	   //读取 相对路径
	   pro.load(new FileReader("src/db.properties"));
	   System.out.println(pro.getProperty("user","bjsxt"));
   }
}
