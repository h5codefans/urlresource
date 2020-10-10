package com.bjsxt.thread.status;
/**
 * yield:暂停本线程  static
 * @author Administrator
 *
 */
public class YieldDemo01 extends Thread {
   public static void main(String[] args){
	 YieldDemo01 y=new YieldDemo01();
	 Thread t=new Thread(y);   //新生
	 t.start();   //就绪
	 
	 //CPU调度
	 
	   for(int i=0;i<1000;i++){
		   if(i%20==0){
			   //暂停本线程main
			   Thread.yield();
		   }
		   System.out.println("main..."+i);
	   }
   }
   @Override
	public void run() {
	   for(int i=0;i<1000;i++){
		   System.out.println("yeild..."+i);
	   }
	}
}
