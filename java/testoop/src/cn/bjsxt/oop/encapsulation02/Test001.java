package cn.bjsxt.oop.encapsulation02;

import cn.bjsxt.oop.encapsulation01.Test01;

public class Test001 extends Test01 {
	 public void ttt(){
		 super.print();
		 print();
	 }
     public static void main(String[] args) {
		Test001 t=new Test001();
		t.print();
	}
}
