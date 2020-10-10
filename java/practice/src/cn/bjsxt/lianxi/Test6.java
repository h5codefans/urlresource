package cn.bjsxt.lianxi;

public class Test6 {
  public static void main(String[] args) {
	StudentT s=new StudentT("李四",23);
	s.printInfo();
}
}

class StudentT{
	private String name;
	private int age;
	
	public StudentT(){
		
	}
	public StudentT(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void printInfo(){
		System.out.println("姓名："+name+",年龄："+age+"岁。");
	}
}
