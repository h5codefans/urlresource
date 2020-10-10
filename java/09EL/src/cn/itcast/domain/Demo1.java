package cn.itcast.domain;

import java.math.BigDecimal;

public class Demo1 {
   
	public static void main(String[] args) {
		double a=0.1;
		double b=0.006;
		
		System.out.println(a+b);
		
		BigDecimal c=new BigDecimal(0.2);
		BigDecimal d=new BigDecimal(0.0000002);
		System.out.println(c.add(d).toString());
	}
}
