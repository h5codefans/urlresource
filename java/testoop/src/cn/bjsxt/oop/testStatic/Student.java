package cn.bjsxt.oop.testStatic;

public class Student {

	 String name;      //属于成员变量
	 int id;           //属于成员变量

     static int ss;//static变量属于类属性
     
     public static void printSS(){
    	 System.out.println(ss);
     }
	 public void study(){      //属于成员方法
		 printSS();
		 System.out.println(name+"在学校");
	 }
	 public void sayHello(String sname){
         System.out.println(name+"向"+sname+"说：你好！");		 
	 }
}
