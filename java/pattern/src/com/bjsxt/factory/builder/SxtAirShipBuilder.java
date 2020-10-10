package com.bjsxt.factory.builder;

public class SxtAirShipBuilder implements AirShipBuilder{
    
	@Override
	public Engine builderEngine() {
		System.out.println("构建发动机！");
		return new Engine("尚学堂牌发动机！");
	}
    
   @Override
	public EscapseTower buildereEscapseTower() {
	   System.out.println("构建逃逸塔！");
		return new EscapseTower("尚学堂牌逃逸塔！");
	}   
	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱！");
		return new OrbitalModule("尚学堂牌轨道舱！");
	}
}
