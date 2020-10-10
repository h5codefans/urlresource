package cn.bjsxt.lianxi;

public class Test8 {
   public static void main(String[] args) {
	  int i,j,n=0;
	  for(i=100;i<201;i++){
		  for(j=2;j<i/2;j++){
			  if(i%j==0){
				  break;
			  }
		  }
		  if(j>=i/2){
			  System.out.print(i+"\t");
			  if(++n%5==0){
				  System.out.println("\n");
			  }
		  }
	  }
}
}
