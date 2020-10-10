package com.bjsxt.thread.create;
/**
 * 推荐Runable 创建线程
 * 1）避免单继承的局限性
 * 2）便于共享资源
 * 
 * 使用Runable 创建线程
 * 1.类实现Runnable接口+重写run()
 * 2.启动多线程  使用静态代理
 *    1）创建真实角色
 *    2）创建代理角色+真实角色的引用
 *    3）调用.start()启动线程
 * @author Administrator
 *
 */
public class Programmer implements Runnable {
      @Override
    public void run() {
    	for(int i=0;i<1000;i++){
    		System.out.println("一边敲hellword...");
    	}
    	
    }
}
