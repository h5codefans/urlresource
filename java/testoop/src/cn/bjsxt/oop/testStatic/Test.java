package cn.bjsxt.oop.testStatic;

public class Test {
      public static void main(String[] args){
    	  Student.ss=323;
    	  Student.printSS();
    	  
    	  Student s1=new Student();
    	  s1.name="高琪";
    	  s1.study();
      }
}
