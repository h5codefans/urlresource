package com.bjsxt.singleton;

/**
 * 测试静态内部类实现单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载！
 * @author Administrator
 *
 */
public class SingletonDemo3 {
   
	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance=new SingletonDemo3();
	}
	
	private SingletonDemo3(){
		
	}
	
	public static SingletonDemo3 getInstance(){
		return SingletonClassInstance.instance;
	}
}
