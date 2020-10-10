package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和发序列化破解单例模式
 * @author Administrator
 *
 */
public class Client2 {

    public static void main(String[] args) throws Exception {
		SingletonDemo5 s1=SingletonDemo5.getInstance();
		SingletonDemo5 s2=SingletonDemo5.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射的方式直接调用私有构造器
//		Class<SingletonDemo5> clazz=(Class<SingletonDemo5>) Class.forName("com.bjsxt.singleton.SingletonDemo5");
//		Constructor<SingletonDemo5> c=clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);        //跳过权限检查
//		SingletonDemo5 s3=c.newInstance();
//		SingletonDemo5 s4=c.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
//		
		//通过反序列化的方式构造多个对象
		
		FileOutputStream fos=new FileOutputStream("f:mycode/e.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f:mycode/e.txt"));
		SingletonDemo5 s3=(SingletonDemo5) ois.readObject();
		System.out.println(s3);
		
    }
}
