package cqyt.sxt.ycx;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 余常鑫
 */
public class Guess_ST_92_4_余常鑫 {

	public static void main(String[] args) {
		int a,r;
		Scanner s=new Scanner(System.in);
		Random rd=new Random();
			while(true){
				System.out.print("请从键盘中输入0-20的整数数字a:");
				a = (int) s.nextDouble();
				if(a>=0&&a<=20){
		            r=rd.nextInt(20);
		            System.out.println("产生随机数r:"+r);
					if(a<r){
						System.out.println("猜小了");
					}else if(a>r){
						System.out.println("猜大了");
					}else{
						System.out.println("恭喜你，猜中了");
						break;
					}
					System.out.println("-----------------------------"+"\n");
				}else {
					System.out.println("对不起，您输入的数据有误.");
				}
		}	
	}
}

