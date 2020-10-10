package cn.bjsxt.test02;
/*
 * 测试switch
 */
public class TestSwitch {
   public static void main(String[] args){
	   double d=Math.random();
	   int e=1+(int)(d*6);
	   switch(e){
	   case 6:
		   System.out.println("e="+e);
	       break;
	   case 5:
		   System.out.println("e="+e);
	       break;
	   case 4:
		   System.out.println("e="+e);
	       break;
	   case 3:
		   System.out.println("e="+e);
	       break;
	   case 2:
		   System.out.println("e="+e);
	       break;
	   default:
		   System.out.println("e="+e);
	       break;
		   
	   }
   }
}
