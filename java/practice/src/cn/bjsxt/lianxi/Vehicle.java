package cn.bjsxt.lianxi;


public class Vehicle {
    int wheels;
    int weight;
     
    public Vehicle(){
    	
    }
	public Vehicle(int wheels, int weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}
    public void vehicle(){
    	System.out.println("轮子个数："+wheels+",车重："+weight+"。");
    }
}
class Car extends Vehicle{
	private int loader;
	public Car(){
		
	}
	public Car(int wheels,int weight,int loader) {
		super(wheels,weight);
		this.loader = loader;
	}
	public void car(){
	  System.out.println("轮子个数："+wheels+",车重："+weight+",限载人数："+loader+"。");
	}
}
class Truck extends Vehicle{
	private int payload;
    public Truck(){
    	
    }
	public Truck(int wheels,int weight,int payload) {
		super(wheels,weight);
		this.payload = payload;
	}
	public void truck(){
		super.vehicle();
		System.out.println("轮子个数："+wheels+",车重："+weight+",载重量："+payload+"。");
	}
	
}
