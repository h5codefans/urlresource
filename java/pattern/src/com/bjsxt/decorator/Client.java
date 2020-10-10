package com.bjsxt.decorator;

public class Client {
   
	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		
		System.out.println("新增新的功能：飞行--------------");
		FlyCar flyCar=new FlyCar(car);
		flyCar.move();
		
		System.out.println("新增新的功能：水里游--------------");
		WaterCar waterCar=new WaterCar(car);
		waterCar.move();
		
		System.out.println("新增两个新的功能：飞行，水里游--------------");
		WaterCar waterCar2=new WaterCar(new FlyCar(car));
		waterCar2.move();
	}

}
