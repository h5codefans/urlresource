package cn.bjsxt.test02;

public class TestWhileFor {
   public static void main(String[] args){

	   for(int i=1;i<=9;i++){
		   for(int j=1;j<=i;j++){
			   System.out.print(j+"*"+i+"="+i*j+"\t");
		   }
		   System.out.println();
	   }
	   System.out.println("#############################################################");
	   outer:for(int i=101;i<150;i++){
		        for(int j=2;j<i/2;j++){
		        	if(i%j==0){
		        		continue outer;
		        	}
		        }
		        System.out.print(i+"   ");
	   }
	   System.out.println();
	   System.out.println("#############################################################");

	   int m,n,k=0;
	   for(m=3;m<=100;m+=2){
		   for(n=2;n<m;n++){
			   if(m%n==0){
				   break;
			   }
		   }
		   if(n>=m){
			   System.out.printf("%6d",m);
			   if(++k%10==0)
				   System.out.println();
		   }
	   }
   }
}
