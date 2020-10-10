package cn.itcast.eclipse;

import org.junit.Test;

//可变参数
public class Varypram {
    
	@Test
	public void testSum(){
		sum(1,2,3,4,5);
	}
	
	public void sum(int ...nums){
		int sum=0;
	    for(int i:nums){
	    	sum+=i;
	    }
	    System.out.println(sum);
	}
	
	@Test
	public void testAa(){
		aa(1, 2,3,4,5,6);
	}
	
	//可变参数需要注意的问题:public void aa(int ...nums,int x)  这样写不行
	public void aa(int x,int ...nums){
		int sum=0;
	    for(int i:nums){
	    	sum+=i;
	    }
	    System.out.println(x+"--"+sum);
	}
}
