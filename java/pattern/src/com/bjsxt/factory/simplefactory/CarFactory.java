package com.bjsxt.factory.simplefactory;


/**
 * 简单工厂
 * @author Administrator
 *
 */
public class CarFactory {

	 public static Car createCar(String type){
		 if("奥迪".equals(type)){
			 return new Aodi();
		 }else if("比亚迪".equals(type)){
			 return new Byd();
		 }else {
			return null;
		}
	 }
}
