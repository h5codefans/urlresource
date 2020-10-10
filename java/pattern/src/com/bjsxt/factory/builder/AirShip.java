package com.bjsxt.factory.builder;

/**
 * 建造者模式
 * 尚学堂牌宇宙飞船
 * @author Administrator
 *
 */
public class AirShip {

	private OrbitalModule orbitalModule;  //轨道舱
	private Engine engine;         //发动机
	private EscapseTower escapeTower;    //逃逸塔
	
	public void launch(){
		System.out.println("发射！");
	}
	
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapseTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapseTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	
}

class OrbitalModule{
	
	private String name;

	public OrbitalModule(String name) {
		
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Engine{
	
	private String name;

	public Engine(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class EscapseTower{
	
	private String name;

	public EscapseTower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
