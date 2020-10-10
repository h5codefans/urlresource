package com.bjsxt.test.annotation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Demo01 /*extends Object*/{
    
	@Override
	public String toString(){
		return "";
	}
	//不建议使用说明
	@Deprecated
	public static void test001(){
		System.out.println("test001");
	}
	
	@SuppressWarnings("all")
	public static void test002(){
		List list=new ArrayList();
		List list2=new ArrayList();
	}

	public static void main(String[] args){
		Date d=new Date();
		test001();
	}
}
