
public class TestFor {
   public static void main(String[] args){
	   int i;
	   int oddSum=0;
	   int evenSum=0;
	   for(i=1;i<=100;i++){
		  if(i%2!=0)
		  {
			oddSum+=i;
		  }else{
			evenSum+=i;
			
		  }

	   }
	   System.out.println("奇数的和："+oddSum+"，偶数的和："+evenSum);
	   System.out.println("##################################");
	   for(int j=1;j<1000;j++){
		  if(j%5==0){
			 System.out.print(j+"\t");
			 }
		  if(j%(5*3)==0){
			  System.out.println();
		  }
		   
	   }
	   
   }
}
