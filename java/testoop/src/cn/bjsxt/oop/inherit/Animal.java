package cn.bjsxt.oop.inherit;

/**
 * 测试继承
 * @author Administrator
 *
 */
public class Animal /*extends Object*/ {
    String eye;

    public void run(){   //每个普通方法中有两个隐式参数，this和super，this指向当前对象，super指向父类对象
        super.toString();
    	System.out.println("跑跑！");
    }
    public void eat(){
    	System.out.println("吃吃！");
    }
    public void sleep(){
    	System.out.println("zzzzzz");
    }
    public Animal(){
    	super();
    	System.out.println("创建一个动物！");
    }
}

class Mammal extends Animal{
    public void taisheng(){
    	System.out.println("我是胎生！");
    }
}

class Bird extends Animal{
	//重写run方法
	public void run(){    
		super.eat();
		System.out.println("我是一只小小小小鸟，飞呀飞不高！");
	}
    public void eggSheng(){
    	System.out.println("卵生！");
    }
    public Bird(){
    	super();//super(),构造函数调用必须在构造函数的第一句
    	System.out.println("建一个鸟对象！");
    }
}