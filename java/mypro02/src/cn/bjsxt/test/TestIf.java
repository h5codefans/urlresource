package cn.bjsxt.test;
/*
 * 测试if语句
 */
public class TestIf {
     public static void main(String[] args){
    	 double d=Math.random();
    	 int e=1+(int)(d*6);     //[1,6]
    	 if(e>3){
    		System.out.println("大数！");
    	 }else{
    		 
    		 System.out.println("小数！");
    	 }
     }
}
