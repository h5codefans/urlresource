package cn.bjsxt.oop.testInterface;

public class MyClass implements MyInterface {
   public void test01(){
	   MyInterface MAX_GREDA;
	   System.out.println("test01");
   }
   public int test02(int a,int b){
	   System.out.println("MyClass.test02()");
	   return a+b;
   }
}
