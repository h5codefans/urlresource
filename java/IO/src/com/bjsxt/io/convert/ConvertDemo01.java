package com.bjsxt.io.convert;

import java.io.UnsupportedEncodingException;
/**
 * 编码与解码字符集必须相同，否则出现乱码
 * @author Administrator
 *
 */
public class ConvertDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException{
		//解码  byte-->char
	     String str="中国";
	     //编码  char-->byte
	     byte[] data=str.getBytes();
	     //编码与解码字符集同一
	    System.out.println(new String(data));
	    
	    //不同一乱码
	    data=str.getBytes("GBK");  //设定编码字符集
	    System.out.println(new String(data));
	    
	    String str1="中国";
	    byte[] data1=str1.getBytes();
	    //字节数不完整
	    System.out.println(new String(data1,0,3));
	    
	}  
}
