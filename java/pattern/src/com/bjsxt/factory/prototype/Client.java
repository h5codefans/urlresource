package com.bjsxt.factory.prototype;

import java.sql.Date;

/**
 * 测试原型模型(浅克隆)
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) throws Exception {
		Date date=new Date(1423424324324L);
		Sheep s1=new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(24366454334252L);
		System.out.println(s1.getBirthday());
		
		Sheep s2=(Sheep) s1.clone();
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
