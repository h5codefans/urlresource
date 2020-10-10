package com.bjsxt.test;
/**
 * 测试自定义的FileSystemClassLoader
 * @author Administrator
 *
 */
public class Demo03 {
     public static void main(String[] args) throws ClassNotFoundException {
		FileSystemClassLoader loader=new FileSystemClassLoader("F:/myjava");
		FileSystemClassLoader loader2=new FileSystemClassLoader("F:/myjava");
	    
		Class<?> c=loader.loadClass("com.bjsxt.bean.Emp");
		Class<?> c2=loader.loadClass("com.bjsxt.bean.Emp");
		Class<?> c3=loader2.loadClass("com.bjsxt.bean.Emp");
		
	    System.out.println(c.hashCode());
	    System.out.println(c2.hashCode());
	    System.out.println(c3.hashCode());  //同一个类，被不同的加载器加载，JVM认为也是不相同的类
	    
     }
}
