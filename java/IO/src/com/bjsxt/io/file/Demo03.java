package com.bjsxt.io.file;

import java.io.File;
import java.io.IOException;

/**
 *常用方法
 *1.文件名
 *getName()
 *getPath()
 *getAbsolutePath()
 *getParent()
 *2.判断信息
 *3.长度(字节数)
 *length()  不能读取文件的长度
 *4.创建、删除
 * @author Administrator
 *
 */
public class Demo03 {
   public static void main(String[] args) throws InterruptedException{
       //test1();
       //test2();
	   try {
		test3();
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println("文件创建失败");
	}
   }
   public static void test3() throws IOException, InterruptedException{
	   //createNewFile()  不存在创建新文件
	   String path="F:/mycode/200.jpg";
	   File src=new File(path);
	   if(!src.exists()){
		   boolean flag=src.createNewFile();
		   System.out.println(flag?"成功":"失败");
	   }
	   
	   //删除文件
	   boolean flag=src.delete();
	   System.out.println(flag?"成功":"失败");
	   
	   //static createTempFile(前缀3个字节，后缀默认.temp)默认临时空间
	 //static createTempFile(前缀3个字节，后缀默认.temp,目录)默认临时空间
	  File temp=File.createTempFile("tes",".temp",new File("F:/mycode"));
	  
	  Thread.sleep(5000);
	   temp.deleteOnExit();//退出及删除
   }
   public static void test1(){
	    //File  src=new File("F:/mycode/2.jpg");
	    //建立联系
	    File src=new File("2.txt");
	    System.out.println(src.getName());//返回名称
	    System.out.println(src.getPath());//如果是绝对路径，返回完整路径，否则返回相对路径
	    System.out.println(src.getAbsolutePath());//返回绝对路径
	    System.out.println(src.getParent());  //返回上级目录,如何使相对，则返回null
	    
   }
   public static void test2(){
	   File src=new File("F:/mycode/a.txt");
	   //是否存在
	   System.out.println("文件是否存在："+src.exists());
	   //是否可读写canWrite() canRead()
	   System.out.println("文件是否可行："+src.canWrite());
	   //是否为绝对路径
	   System.out.println("是否为绝对路径："+src.isAbsolute());//无盘符(如：d:)为相对路径
	   //isFile()
	   //isDirectory()
	   if(src.isFile()){
		   System.out.println("文件");
	   }else if(src.isDirectory()){
		   System.out.println("文件夹");
	   }else{
		   System.out.println("文件不存在");
	   }
	   
	   System.out.println("长度为："+src.length());
   }
}
