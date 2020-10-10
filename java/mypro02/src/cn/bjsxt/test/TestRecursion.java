package cn.bjsxt.test;


/**
 * 测试递归算法的基本流程，并且写了一个阶乘的例子
 * @author 余常鑫
 * @version 1.0
 * 
 */
public class TestRecursion {

	static int a=0;
	
	/**
	 * 测试递归头和递归体的基本作用
	 */
	public static void test01(){
		a++;
		System.out.println("test01:"+a);
		if(a<=10){   //递归头
		  test01();
		}else{   //递归体
		 System.out.println("over");
		}
	}
	
	/**
	 * 我是test02
	 */
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	
    /**
     * 计算阶乘，阶乘的意思是：5*4*3*2*1
     * @param n 阶乘的最大数
     * @return 阶乘的结果值
     */
	
	public static long factorial(int n){
		if(n==1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
    public static void main(String[] args){
    	//test01();
    	int sum=0;
    	for(int i=1;i<=20;i++){
    		sum+=factorial(i);
    	}
    	System.out.println(sum);
    }
}
