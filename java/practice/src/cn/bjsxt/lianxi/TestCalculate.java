package cn.bjsxt.lianxi;

class Calculate1 {
   private double x;
   private double y;
   public Calculate1(){}
   public Calculate1(double x,double y){
	   this.x=x;
	   this.y=y;
   }
    public double add(double x,double y){
    	return x+y;
    }
    public double mius(double x,double y){
    	return x-y;
    }
   
}
class Calculate2 extends Calculate1{
	public double multiply(double x,double y){
		return x*y;
	}
	public double divide(double x,double y){
		if(y==0.0){
			System.out.println("被除数不能为0");
			return 0.0;
		}
			return x/y;

	}
}

public class TestCalculate{
	public static void main(String[] args) {
		Calculate2 c=new Calculate2();
		System.out.println(c.add(3, 4));
		System.out.println(c.mius(3, 4));
		System.out.println(c.multiply(3, 4));
		System.out.println(c.divide(3, 4));
	}
	
}
