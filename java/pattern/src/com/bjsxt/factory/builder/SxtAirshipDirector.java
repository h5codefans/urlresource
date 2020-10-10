package com.bjsxt.factory.builder;

public class SxtAirshipDirector implements AirShipDirector{
    
	private AirShipBuilder builder;
    
	public SxtAirshipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}

    @Override
    public AirShip directAirShip() {
		Engine e=builder.builderEngine();
		OrbitalModule o=builder.builderOrbitalModule();
		EscapseTower et=builder.buildereEscapseTower();
		
		//装配成飞船对象
		AirShip ship=new AirShip();
		ship.setEngine(e);
		ship.setOrbitalModule(o);
		ship.setEscapeTower(et);
		
		return ship;
    }
}
