package com.bjsxt.test;
/**
 * 测试简单的加密解密(取反)操作
 * @author Administrator
 *
 */
public class Demo04 {
   public static void main(String[] args) throws Exception  {
	   //测试取反操作
//       int a=3;   //00000011;
//       System.out.println(Integer.toBinaryString(a^0xff));
       
	    //加密后的class文件，正常的类加载器无法加载数据，报classFormatError
//		FileSystemClassLoader loader=new FileSystemClassLoader("F:/myjava/com/bjsxt/bean/temp");
//		Class<?> c=loader.loadClass("Emp");
//		System.out.println(c);
		
		DecrptClassLoader loader=new DecrptClassLoader("F:/myjava/com/bjsxt/bean/temp");
		Class<?> c=loader.loadClass("Emp");
		System.out.println(c);
   }
}
