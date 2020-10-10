package com.bjsxt.test.annotation;

public class Demo02 {
    
	@SxtMyAnnotation01(age=19,studentName="老高",schools={"北京大学","北京航空航天大学"})
	public void test(){
		
	}
	
	@SxtAnnotation("aaa")
	public void test2(){
		
	}
}
