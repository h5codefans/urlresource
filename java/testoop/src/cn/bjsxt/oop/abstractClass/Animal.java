package cn.bjsxt.oop.abstractClass;

public abstract class Animal {
	String str;
    public abstract void run();//抽象方法的意义在于：将方法的设计和方法 的实现分离了！
    public void breath(){
    	System.out.println("呼吸！");
    }
    public Animal(){
    	run();    //或this.run()方法，this为隐式参数，调用的是Cat的run方法
    	System.out.println("创建一个动物！");
    }
}
class Cat extends Animal{
       public void run(){
    	   System.out.println("猫步小跑！");
       }
}
class Dog extends Animal{
	public void run(){
		System.out.println("小狗汪汪叫！");
	}
}