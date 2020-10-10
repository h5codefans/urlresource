package com.bjsxt.test;

import com.bjsxt.test.Outer02.StaticInnerClass;

/**
 * 测试静态内部类的详细用法
 * @author Administrator
 *
 */
public class Demo02 {
    //Outer02.StaticInnerClass osic=new Outer02.StaticInnerClass();
	//StaticInnerClass sic=new StaticInnerClass();
}

class Outer02{
	int c=5;
	static int d=10;
	
	void ttt(){
		StaticInnerClass sic=new StaticInnerClass();
	
	}
	//静态内部类
	/*private*/ static class StaticInnerClass{
		int a=3;
		static int b=5;
		
		public void test(){
			System.out.println(d);
			//System.out.println(c);  //静态内部类中不能调用外部类的普通成员，只能调用静态成员！
		}
	}
}
