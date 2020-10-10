package cn.bjsxt.test;

/**
 * 测试包装类的基本用法
 * @author Administrator
 *
 */
public class Test01 {
	  public static void main(String[] args){
	      Integer i=new Integer(1000);
	      System.out.println(Integer.MAX_VALUE);
	      System.out.println(Integer.toHexString(i));
	      
	      Integer i2=Integer.parseInt("235");
	      System.out.println(i2);
	      
	      Integer i3=new Integer("2323");
	      System.out.println(i3.intValue());
	      
	  }
}
