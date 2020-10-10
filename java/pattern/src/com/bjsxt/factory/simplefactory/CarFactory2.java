package com.bjsxt.factory.simplefactory;


/**
 * 简单工厂
 * @author Administrator
 *
 */
public class CarFactory2 {

	 public static Car createAodi(){
	     return new Aodi();
	 }
	 
	 public static Car createByd(){
		 return new Byd();
	 }
}
