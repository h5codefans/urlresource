package com.bjsxt.factory.prototype;

import java.sql.Date;

/**
 * 原型模式(深复制)
 * @author Administrator
 *
 */
public class Client2 {

	public static void main(String[] args) throws Exception {
		Date date=new Date(1423424324324L);
		Sheep2 s1=new Sheep2("少利",date);
		Sheep2 s2=(Sheep2) s1.clone();  //实现深复制，s2对象的birthday是一个新对象！
		
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(24366454334252L);
		System.out.println(s1.getBirthday());
		
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
