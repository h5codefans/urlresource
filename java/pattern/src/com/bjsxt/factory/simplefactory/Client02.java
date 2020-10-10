package com.bjsxt.factory.simplefactory;


/**
 * 测试在简单工厂模式的情况下
 * @author Administrator
 *
 */
public class Client02 {
 
	public static void main(String[] args) {
		Car c1=CarFactory.createCar("奥迪");
		Car c2=CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
	}
}
