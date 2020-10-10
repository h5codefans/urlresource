package com.bjsxt.strategy;

public class NewCustomManyStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打九折！");
		return standardPrice*0.9;
	}
}
