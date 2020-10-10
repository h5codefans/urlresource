package cn.bjsxt.lianxi;

public class Test{
	public static void main(String[] args) {
		Calculate calculate=new Calculate();
		int a=calculate.add(3, 4);
		System.out.println(a);
		int d=calculate.div(4, 0);
		System.out.println(d);
	}
}
class Calculate{
   private int x;
   private int y;
   
   public Calculate(){
	   
   }
   public Calculate(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}


   public static int add(int x,int y){
	   return x+y;
   }
	
   public static int sub(int x,int y){
	   return x-y;
   }
   public static int mult(int x,int y){
	   return x*y;
   }
   public static int div(int x,int y){
		   try {
			  if(y==0)
				  throw new CanNotDiv0("除数不能为0");
		} catch (CanNotDiv0 e) {
			e.printStackTrace();
		}
	   return x/y;
   }
}
class CanNotDiv0 extends Exception{
	public CanNotDiv0(){
		
	}
	public CanNotDiv0(String message){
		super(message);
	}
}

