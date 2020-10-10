package com.bjsxt.io.file;

import java.io.File;
import java.util.Arrays;

/**
 * 输出子孙级目录|文件的名称(绝对路径)
 * 1.listFiles()
 * 2.递归
 *  static listRoots()  根路径
 * @author Administrator
 *
 */
public class Demo05 {
   public static void main(String[] args){
	   String path="F:/mycode";
	   File parent=new File(path);
	   printName(parent);
	   
	   File[] roots=File.listRoots();
	   System.out.println(Arrays.toString(roots));  //盘符[C:\, D:\, E:\, F:\, G:\]
	   for(File temp:roots){
//		   printName(temp);
	   }
	   
   }
   /**
    * 输出路径
    */
   public static void printName(File src){
	   if(null==src||!src.exists()){             //递归体
		   return ;
	   }
	   System.out.println(src.getAbsolutePath());
	   if(src.isDirectory()){  //文件夹              //递归头
		  for(File sub:src.listFiles()){
			  printName(sub);
		  }
	   }
   }
}
