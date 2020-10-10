package com.bjsxt.strategy;

public class Clinet {
     public static void main(String[] args) {
		Strategy s1=new OldCustomManyStrategy();
		Context ctx=new Context(s1);
		
		ctx.printPrice(998);
	}
}
