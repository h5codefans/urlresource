package cn.bjsxt.testException;


public class TestException {
    public static void main(String[] args) {
		//int i=1/0;                       //uncheckedException
		 Computer c=null;
		 if(c!=null){
	         c.start();   //对象是null,调用了对象的方法或属性
		 }
            //String str="1323sdfds";
            //Integer i=new Integer(str);
		 
		 try {                     //checkedException
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Computer{
	void start(){
		System.out.println("计算机启动！");
	}
}