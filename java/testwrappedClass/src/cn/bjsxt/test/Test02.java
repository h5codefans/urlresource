package cn.bjsxt.test;

/**
 * 测试自动装箱和拆箱
 * @author Administrator
 *
 */
public class Test02 {
    public static void main(String[] args){
     	//Integer a=new Integer(1000);
     	Integer a=1000;      //jdk5.0之后，自动装箱，编译器帮我们改进代码：Integer a=new Integer(1000)
     	
     	Integer b=2000;
     	//Integer c=new Integer(2000).intValue();
     	int c=b;//自动拆箱，编译器改进：b.intValue();
     	
     	System.out.println(c);
     	
     	Integer d=223;    
     	Integer d2=223;
     	System.out.println(d==d2);
     	System.out.println(d.equals(d2));
     	
     	
     	System.out.println("########################");
     	Integer d3=-100;   //[-128,127]之间的数，仍然当做基本数据处理
     	Integer d4=-100;
     	System.out.println(d3==d4);
     	System.out.println(d3.equals(d4));
     	
    }
}
