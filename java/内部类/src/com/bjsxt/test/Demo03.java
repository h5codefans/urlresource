package com.bjsxt.test;

import java.util.Date;


public class Demo03 {
     public static void main(String[] args) {
		Outer03 out=new Outer03();
		Outer03.InnerClass ic=out.new InnerClass();
		ic.test();
	}
}

class Outer03{
	private int a=3;
	int b=10;
	
	public void ttt(){
		InnerClass ic=new InnerClass();
	}
	//成员内部类
	class InnerClass{
		int c=1;
		//static int d=98;     //成员内部类不能有静态成员,除非声明为final,并且只能是编译器可以确定值的常量表达式
		final static int d=80;
		//final static Date d2=new Date();
		void test(){
			System.out.println(a);
			System.out.println("内部类对象："+this);    //成员内部类对象的创建，必须先有外部类对象！
		    System.out.println("外部类对象:"+Outer03.this);
		}
	}
}