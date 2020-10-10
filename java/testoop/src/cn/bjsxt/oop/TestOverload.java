package cn.bjsxt.oop;

/**
 * 测试重载
 * @author Administrator
 *
 */
public class TestOverload {
    public static void main(String[] args){
    	MyMath m=new MyMath();
    	int result=m.add(4.9,8);
    	System.out.println(result);
    }
}
class MyMath{
	int a;
	int b;
	public MyMath(){
		
	}
	public MyMath(int a){
		this.a=a;
	}
	public MyMath(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int add(int b,double a){
		return (int)(a+b);
	}
	public int add(double a,int b){
		return (int)(a+b);
	}
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
}