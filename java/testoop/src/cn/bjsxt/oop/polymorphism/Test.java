package cn.bjsxt.oop.polymorphism;

public class Test {
   
	public static void testAnimalVoice(Animal c){
		c.voice();
		if(c instanceof Cat){
			((Cat) c).catchMouse();//把Animal强制转换为Cat
		}
	}
	/*
	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	public static void testAnimalVoice(Pig c){
		c.voice();
	}
	*/
	public static void main(String[] args){
		Animal c=new Cat(); //多态，1.有继承，2.要有方法重写，3.父类引用指向子类对象
		testAnimalVoice(c);
		Cat c2=(Cat)c;
		
		
		//c2.catchMouse();
		//Animal d=new Dog();
		//Animal p=new Pig();
		//Animal t=new Tiger();
		//testAnimalVoice(d);
		//testAnimalVoice(p);
        //testAnimalVoice(t);

	}
}
