package com.bjsxt.io.file;

import java.io.File;


/**
 * 相对路径与绝对路径构造File对象
 *
 */
public class Demo02 {
	public static void main(String[] args){
	    String parentPath="F:/mycode";
	    String name="2.jpg";
	    
	    //相对路径
	    File src=new File(parentPath,name);
	    src=new File(new File(parentPath),name);
	    //输出
	    System.out.println(src.getName());
	    System.out.println(src.getPath());
	    
	    //绝对路径
	    src=new File("F:/mycode/2.jpg");
	    System.out.println(src.getName());
	    System.out.println(src.getPath());
	    
	    //没有盘符：一user.dir构建
	    src=new File("test.txt");
	    System.out.println(src.getName());
	    System.out.println(src.getPath());
	    System.out.println(src.getAbsolutePath());
	}

}
