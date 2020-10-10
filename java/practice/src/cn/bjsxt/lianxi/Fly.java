package cn.bjsxt.lianxi;

public interface Fly {
    void fly();
}
class Sparrow implements Fly{
	public void fly(){
		System.out.println("我是麻雀，我有翅膀，我振翅高飞。");
	}
}
class Plane implements Fly{
	public void fly(){
		System.out.println("我是飞机，我有助推器，我可以飞行。");
	}
}
