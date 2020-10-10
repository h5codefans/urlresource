package cn.bjsxt.lianxi;

public class Test9 {
	   public static void main(String[] args) {
		int i,n,j;
		for(i=1;i<1000;i++){
			n=0;
			for(j=1;j<i;j++){
				if(i%j==0){
					n=n+j;
				}
			}
			if(n==i){
				System.out.print(i+"\t");
			}
		}
	}
}