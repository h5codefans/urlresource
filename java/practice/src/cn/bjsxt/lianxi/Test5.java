package cn.bjsxt.lianxi;

public class Test5 {
   public static void main(String[] args){
	   int i,m,n,k,j,p=0;

	   for(i=1;i<1000;i++){
		   m=i%10;
		   n=i/10%10;
		   k=i/100;
		   j=i/10;
		   if(i<10&&i==m*m*m){
			   System.out.print(i+"\t");
			   p++;
		   }else if(i<100&&(i==m*m*m+j*j*j)){
			   System.out.print(i+"\t");
			   p++;
		   }else if(i<1000&&(i==k*k*k+n*n*n+m*m*m)){
			   System.out.print(i+"\t");
			   p++;
			   
		   }
		   if(p%3==0){
			   System.out.println("\n");
		   }
	   }
	   
   }
}
