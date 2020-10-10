package cn.bjsxt.lianxi;

public class TestSudent {
   public static void main(String[] args) {
	  Student s=new Student();
	  s.setName("张三");
	  s.setSex("男");
	  s.setAge(22);
	  System.out.println("我叫"+s.getName()+",今年"+s.getAge()+"岁,"+"性别："+s.getSex()+"。");
}
}
