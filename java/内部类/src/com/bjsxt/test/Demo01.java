package com.bjsxt.test;

/**
 * 测试内部类
 * @author Administrator
 *
 */
public class Demo01 {
   
	//静态内不能
	private static class StaticNestedClass{
		
	}
	
	//普通内部类(成员内部类)
	private class FieldInnerClass{
		
	}
	void sayHello(){
		//方法内部类(局部内部类)
		class LocalClass{
			
		}
		
		//匿名内部类
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
		
			}
		};
	}
}
