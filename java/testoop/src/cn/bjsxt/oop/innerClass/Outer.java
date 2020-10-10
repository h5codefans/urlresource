package cn.bjsxt.oop.innerClass;

public class Outer {
     public static void main(String[] args){
    	 Face f=new Face();//先构造Face类，才能再构造Nose类(非静态类)
    	 Face.Nose n=f.new Nose();
    	 n.breath();
    	 
    	 Face.Ear e=new Face.Ear();
    	 e.listen();
     }
}
class Face{
	int type=20;
	String shape="瓜子脸";
	static String color="红润";
	
	class Nose{  //内部类从属于外部类Face的对象
		String type;
		void breath(){
			System.out.println(Face.this.type);   //如果内部类与外部类属性重名，要加外部类名
			System.out.println(shape);            //内部类可以直接用外部类的属性
			System.out.println("呼吸！");
		}
	}
	static class Ear{  //静态内部类从属于外部类Face的对象
		void listen(){
			System.out.println(color);
			System.out.println("我在听");
		}
	}
}

