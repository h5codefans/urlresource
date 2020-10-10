package cn.bjsxt.lianxi;

import java.util.Scanner;

public class Test1 {
   public static void main(String[] args){
	   Scanner s=new Scanner(System.in);
	   System.out.println("请输入一个百分制成绩！");
	   int a=s.nextInt();
	   double b=a/20;
	   System.out.println(b);
   }
}
