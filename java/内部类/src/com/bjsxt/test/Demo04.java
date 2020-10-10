package com.bjsxt.test;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 测试方法内部类
 * @author Administrator
 *
 */
public class Demo04 {

}

class Outer04{
	public void test(){
		/*final*/int a=3;
		class Inner{
			int b=10;
			//static int c=20;   //方法内部类中只能定义非静态成员
			void tt(){
				//System.out.println(a);     //方法内部类中不能引用所在方法的普通局部变量，除非是常量
				//方法的生命周期和方法内部类对象的生命周期不一致
			}
		}
		
		Inner i=new Inner();
	}
}
