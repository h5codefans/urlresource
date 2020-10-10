package cn.bjsxt.lianxi01;

public class Trandgs {
     public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<3;i++){
			for(k=0;k<2-i;k++){
				System.out.print(" ");
			}
			for(j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
