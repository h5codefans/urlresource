package com.bjsxt.io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 4.操作目录
 * mkdir() 创建目录，必须确保父目录存在，如何不出在，创建失败
 * mkdirs()   创建目录，如果父目录不出在，一同创建
 * list 文件|目录名字符串形式
 * listFiles() 
 * static listRoots()  根路径
 * @author Administrator
 *
 */
public class Demo04 {
   public static void main(String[] args){
     String path="F:/mycode";
     File src=new File(path);//文件夹
     if(src.isDirectory()){  //存在并且为目录
    	 System.out.println("=========子目录|文件名=========");
    	 String[] subNames=src.list();
    	 for(String temp:subNames){
    		 System.out.println(temp);
    	 }
    	 System.out.println("=========子目录|File文件对象=========");
    	 File[] subFiles=src.listFiles();
    	 for(File temp:subFiles){
    		 System.out.println(temp.getAbsolutePath());
    	 }
    	 System.out.println("=========子文件.txt文件对象=========");
    	 //命令设计模式
    	 subFiles=src.listFiles(new FilenameFilter(){

			@Override
			/**
			 * dir代表src
			 */
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile()&&name.endsWith(".txt");
			}
    		 
    	 });
    	 for(File temp:subFiles){
    		 System.out.println(temp.getAbsolutePath());
    	 }
     }
   }
   public static void test2(){
	   
   }
   public static void test1(){
	   String path="F:/mycode/parent/test";
	   File src=new File(path);
	   //src.mkdir();
	   src.mkdirs();
   }
}
