package cn.bjsxt.oop.testInterface;

public interface Flyable {
    int MAX_SPEED=11000;
    int MAX_HEIGHT=1;
    void fly();		
}
interface Attack{
	void attack();
}
class Plane implements Flyable{
	public void fly(){
	 System.out.println("飞机依靠发动机在飞！");
	}
}

class Man implements Flyable{
	public void fly(){
		System.out.println("跳起来，飞");
	}
}

class Stone implements Flyable,Attack{
	int weight;
	public void fly(){
		System.out.println("被人扔出去,飞");
	}
	public void attack(){
		System.out.println("石头攻击");
	}
}

