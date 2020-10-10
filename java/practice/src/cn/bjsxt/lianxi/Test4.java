package cn.bjsxt.lianxi;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入您的工资:");
		int salary=s.nextInt();
		int p;
		if(salary>3500){
			p=salary-3500;
			switch (p/500) {
			case 0:
				System.out.println("您需交个人所得税金额为："+(double)p*0.03+"元");
				break;
            case 1:
            case 2:
            case 3:
            	System.out.println("您需交个人所得税金额为："+(double)p*0.05+"元");	
            	break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            	System.out.println("您需交个人所得税金额为："+(double)p*0.1+"元");
			default:
				System.out.println("您需交个人所得税金额为："+(double)p*0.12+"元");
				break;
			}
		}else{
			System.out.println("您不需要缴纳个人所得税！");
		}

	}
}
