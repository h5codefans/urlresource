package com.bjsxt.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程的环境下五种单例模式的效率
 * @author Administrator
 *
 */

public class Client3 {

    public static void main(String[] args) throws Exception {
       
    	long start=System.currentTimeMillis();
    	int threadNum=10;
    	final CountDownLatch countDownLatch=new CountDownLatch(threadNum);
    	for(int i=0;i<10;i++){
        	new Thread(new Runnable() {
    			
    			@Override
    			public void run() {
    				for(int i=0;i<1000000;i++){
    					//Object o=SingletonDemo3.getInstance();
    					Object o=SingletonDemo4.INSTANCE;
    				}
        			countDownLatch.countDown();
    			}
    			
    		}).start();
    	}
        
    	countDownLatch.await();   //main线程阻塞，直到计时器变为0，才会继续往下执行!
    	
		long end=System.currentTimeMillis();
		System.out.println("总耗时："+(end-start));
	}
}
