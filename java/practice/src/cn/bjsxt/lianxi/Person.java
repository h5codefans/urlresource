package cn.bjsxt.lianxi;

public abstract class Person {
   private String name;
   void Introduce(){
	   
	   System.out.println("自我介绍！");
   }
   public String getName(){
	   return name;
   }
   public void setName(String name){
	   this.name=name;
   }
}
interface Programm{
	void programm();
}
class Java extends Person implements Programm{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void Introduce(){
		System.out.print("我是"+name+"，");
		programm();
	}

	@Override
	public void programm() {
      System.out.println("我会编写java程序。");
		
	}
}
class Net extends Person implements Programm{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void Introduce(){
		System.out.print("我是"+name+"，");
		programm();
	}
	public void programm(){
	  System.out.println("我会编写.net程序。");
	}
}