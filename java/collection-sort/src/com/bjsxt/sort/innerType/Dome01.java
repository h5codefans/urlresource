package com.bjsxt.sort.innerType;

/**
 * 内置引用数据类型(常用)的比较
 */
import java.util.Date;

public class Dome01 {
    public static void main(String[] args) {
		Integer a;   //根据基本数据类型大小
		Character ch;  //根据Unicode编码顺序
		String str="abc";   //如果其中一个是另一个字符串的起始字符串，返回长度之差
		                    //否则返回第一个不相等的Unicode码之差
		String str2="abcd123";
		System.out.println(str.compareTo(str2));
		str="abc";
		str2="aac";
		System.out.println(str.compareTo(str2));
		
		Date date;   //根据日期的长整形术标比较
	}
}
