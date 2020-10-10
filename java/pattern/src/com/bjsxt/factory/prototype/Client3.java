package com.bjsxt.factory.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

/**
 * 原型模式(深复制,使用序列化和反序列化实现深复制)
 * @author Administrator
 *
 */
public class Client3 {

	public static void main(String[] args) throws Exception {
		Date date=new Date(1423424324324L);
		Sheep s1=new Sheep("少利",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//Sheep s2=(Sheep) s1.clone();
		//使用序列化和反序列化实现深复制
		
		//序列化
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(s1);
		byte[] bytes=bos.toByteArray();
		
		//反列化
		ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Sheep s2=(Sheep) ois.readObject();   //克隆好的对象！
		
		System.out.println("修改原型的属性值！");
		date.setTime(24366454334252L);
		System.out.println(s1.getBirthday());
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
	

		
	}

}
