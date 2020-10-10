package cn.bjsxt.test;

public class TestMethod {
	public static void test01(){
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
	}
	public static void test02(){
	 	   for(int j=1;j<1000;j++){
	  		  if(j%5==0){
	  			 System.out.print(j+"\t");
	  			 }
	  		  if(j%(5*3)==0){
	  			  System.out.println();
	  		  }
	  		   
	  	   }
	}
	//java方法中，只有值传递，没有引用传递
	public static int add(int a,int b){
		int sum=a+b;
		if(a==3){
			return 0;      //return两个作用：返回值，结束方法的运行
		}
		System.out.println("输出");
		return sum;
	}
    public static void main(String[] args){
       test01();
       System.out.println("##################################");
       test02();
       int s=add(3,5);
       System.out.println(s);
    }
}
