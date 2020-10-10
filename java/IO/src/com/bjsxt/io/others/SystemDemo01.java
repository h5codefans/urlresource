package com.bjsxt.io.others;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 三个常量
 * 1.System.in   输入流
 * 2.System.out  输出流
 *    System.err
 *    
 *重定向
 *setIn()
 *setOut()
 *setErr()
 * @author Administrator
 *
 */
public class SystemDemo01 {
    
	public static void main(String[] args) throws FileNotFoundException{
        // test1();
		//Scanner sc=new Scanner(System.in);
		//重定向
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("F:/mycode/print.txt")),true));
		System.out.println("absdf");  //控制台-->文件
		
		//回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("back........");
		
		
	}
	public static void test1(){
		System.out.println("test");
		System.err.println("err");
	}
}
