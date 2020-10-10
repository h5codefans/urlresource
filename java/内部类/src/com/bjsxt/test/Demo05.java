package com.bjsxt.test;

public class Demo05 {
	public static void main(String[] args) {
		   Outer05 out=new Outer05();
		   out.test();
		   
	}
}
class Outer05{
	
	   public void test02(Car c){
		   c.run();
	   }
	   public void test(){
		 //匿名内部类(接口式)，由于本内部类定义在方法中，也是方法内部类   
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				
			}
		 };
		 
		 //匿名内部类,继承式
		 Car car=new Car(){
			 @Override
			 public void run() {
				 System.out.println("子类的车跑！");
			 };
		 };
		 car.run();
		 
		 //匿名内部类,参数式
		 test02(new Car(){
			 
			 @Override
			public void run() {
				 System.out.println("参数式匿名内部类，车再跑！");
			}
		 });
		 
	   }
}

class Car{
	public void run(){
		System.out.println("汽车跑！");
	}
}