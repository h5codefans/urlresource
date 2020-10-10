package cn.bjsxt.oop.encapsulation01;

public class Test01 {
     private String str;
     protected void print(){
    	 System.out.println("Test01");
     }
}
class Test0001 extends Test01{
	public void pp(){
		print();
	}
}
