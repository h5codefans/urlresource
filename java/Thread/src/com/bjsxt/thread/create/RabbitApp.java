package com.bjsxt.thread.create;

public class RabbitApp {
    public static void main(String[] args){
    	//1.创建子类对象
    	Rabbit rab=new Rabbit();
    	Tortoise tor=new Tortoise();
    	//调用start()方法
    	rab.start(); //不要调用run()方法    
    	tor.start();
    	//rab.run();
    	//tor.run();
    	
    	for(int i=0;i<1000;i++){
    		System.out.println("main==>"+i);
    	}
    }
}
