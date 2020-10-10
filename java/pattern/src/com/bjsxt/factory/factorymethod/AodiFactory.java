package com.bjsxt.factory.factorymethod;

public class AodiFactory implements CarFactory{
   
	@Override
    public Car createCar() {
    	
    	return new Aodi();
    }	
}
