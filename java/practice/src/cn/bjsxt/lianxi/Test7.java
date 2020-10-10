package cn.bjsxt.lianxi;

import java.util.Scanner;

public class Test7 {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("请输入一个整数！");
	int shu=s.nextInt();
	int j=2;
	for(;j<(int)(shu/2);j++){
		if(shu%j==0){
			System.out.println(shu+"不是素数！");
			break;
		}
	}
	if(j>=(int)(shu/2)){
		System.out.println(shu+"是素数！");
	}
}
}
