package com.bjsxt.singleton;

import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * @author Administrator
 *
 */
public class SingletonDemo5 implements Serializable{
	//类初始化是，不初始化这个对象（延时加载，真正用的时候再创建)
	public static SingletonDemo5 instance;
	
	private SingletonDemo5(){
		//防止反射
		if(instance!=null){
			throw new RuntimeException();
		}
	}
	//方法同步，调用效率低！
	public static synchronized SingletonDemo5 getInstance(){
		if(instance==null){
			instance=new SingletonDemo5();
		}
		return instance;
	}
	
	//破解反序列化
	//反序列化时，如果定义了readResolve()则直接返回方法指定的对象。而不需要单独在创建对象
	private Object readResolve(){
		return instance;
	}
}
