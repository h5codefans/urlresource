package cn.bjsxt.oop;

//以类的方式组织代码，以对象的方式组织数据
public class Student {
    //静态的数据
	 String name;
	 int id;
	 int age;
	 String gender;
	 int weight;
	 
	 Computer computer;
	//动态的行为
	 public void study(){
		 System.out.println(name+"在学校");
	 }
	 public void sayHello(String sname){
         System.out.println(name+"向"+sname+"说：你好！");		 
	 }

}
