package cn.bjsxt.array;

/**
 * 数组的基本概念
 * @author Administrator
 *
 */
public class Test01 {
   public static void main(String[] args){
	   /**
	    * 1.数组是相同数据（数据可以是任意类型）的有序集合
	    * 2.数组也是对象，数组元素相对于对象的成员变量（详情请见内存图）
	    * 3.数组长度是确定的，不可变的。如果越界，则报越界异常
	    */
	   int[] a=new int[3];
	   a[0]=23;
	   a[1]=28;
	   a[2]=32;

       Car[] cars=new Car[4];
       cars[0]=new Car("奔驰");
       cars[1]=new Car("宝马");
       
       System.out.println(cars[0].name);
       
       System.out.println(a.length);
       for(int i=0;i<a.length;i++){
    	   System.out.println(a[i]);
       }
	   
   }
}
