package com.bjsxt.io.file;

import java.io.File;

/**
 * 两个变量
 * 1.路径分割符
 * 2.名称分割符\(windows)  /(linux等)
 * @author Administrator
 *
 */
public class Demo01 {
   public static void main(String[] args){
	   System.out.println(File.pathSeparator);
	   System.out.println(File.separator);
	   
	   //路径表示形式
	   String path="F:\\mycode\\2.jpg";
	   path="F:"+File.separator+"mycode"+File.separator+"2.jpg";	
	   //推荐方式
	   path="F:/mycode/2.jpg";
   }
}
