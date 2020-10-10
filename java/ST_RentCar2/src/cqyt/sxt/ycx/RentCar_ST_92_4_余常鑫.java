package cqyt.sxt.ycx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * 租车单价
 * @author Administrator
 *
 */
class SinglePrice {
	//别克商务舱GL8
	public static int BKSWC=600;
	//宝马550i
	public static int BM=500;
	//别克林荫大道
	public static int BKLYDD=300;
	//金杯、金龙客车小于16座
	public static int XY=800;
	//金杯、金龙客车大于16座
	public static int DY=1500;
}
//机动车抽象类
abstract class MotoVehicle {

	protected String no;
	protected String brand;
	protected String color;
	//里程
	protected String mileage;
	public abstract int CalcRent(int days);
}

//轿车类
class Car extends MotoVehicle {
	
	protected  String type;
	protected  Car car;
	public Car() {}
	
	public Car(String type){
		this.type=type;
	}
    public Car(Car car) {
		this.car = car;
	}

	@Override
  public int CalcRent(int days) {
		return car.CalcRent(days);
		
  }
}

//别克商务舱GL8轿车
class BKSWC extends Car {
  public BKSWC() {}
  
  public BKSWC(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BKSWC+"元/天，租用"+days+"天，租金："+days*SinglePrice.BKSWC+"元");
      return days*SinglePrice.BKSWC;
 }
}

//宝马550i轿车
class BM extends Car{
  public BM() {}
  
  public BM(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BM+"元/天，租用"+days+"天，租金:"+days*SinglePrice.BM+"元");
      return days*SinglePrice.BM;
 }
}

//别克林荫大道轿车
class BKLYDD extends Car{
  public BKLYDD(){}
  
  public BKLYDD(String type){
	  super(type);
  }
  public int CalcRent(int days) {
      System.out.println(this.type+","+SinglePrice.BKLYDD+"元/天，租用"+days+"天，租金："+days*SinglePrice.BKLYDD+"元");
      return days*SinglePrice.BKLYDD;
 }
}

//客车类
class Bus extends MotoVehicle{
    //客车座位是否需要大于16座
	protected  boolean seatCount;
	protected String type;
	private Bus bus;
	public Bus() {}
	
	public Bus(Bus bus) {
		this.bus = bus;
	}    
  
	
	public Bus(boolean seatCount,String type) {
		this.seatCount = seatCount;
		this.type=type;
	}

	@Override
	public  int CalcRent(int days) {
		return bus.CalcRent(days);
	}
}

//金杯客车
class JB extends Bus{
	public JB(){}
	
    public JB(boolean seatCount,String type){
    	super(seatCount,type);
    }
	public  int CalcRent(int days) {
	       if(!this.seatCount){
	    	   System.out.println(this.type+"小于16座，"+SinglePrice.XY+"元/天，租用"+days+"天，租金:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println(this.type+"大于16座，"+SinglePrice.DY+"元/天，租用"+days+"天，租金:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}

//金龙客气
class JL extends Bus{
	public JL(){}
	
	public JL(boolean seatCount,String type){
		super(seatCount,type);
	}
	public  int CalcRent(int days) {
	       if(!this.seatCount){
	    	   System.out.println(this.type+"小于16座，"+SinglePrice.XY+"元/天，租用"+days+"天，租金:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println(this.type+"大于16座，"+SinglePrice.DY+"元/天，租用"+days+"天，租金:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}
/**
 * 余常鑫
 * @author Administrator
 *
 */
public class RentCar_ST_92_4_余常鑫 {
   public static void rentCar(List<Integer> list){
	   System.out.print("请输入租车天数：");
	   Scanner s=new Scanner(System.in);
       int days=s.nextInt();
	   while(true){
		   System.out.print("请输入租车类型，"+"1"+"表示轿车，"+2+"表示客车:");
		   int type=s.nextInt();
		   if(type==1){
               car(days,list);
               break;
		   }else if(type==2){
               bus(days,list);
               break;
		   }
	   }

	   System.out.println("#########################################");
   }
   public static void car(int days,List<Integer> list){ 
	  System.out.print("请输入租车车型,"+1+",表示别克商务舱GL8，"+2+"表示宝马550i，"+3+"表示别克林荫大道：");
	  Scanner s1=new Scanner(System.in);
	  int num = s1.nextInt();
 	  switch(num){
	      case 1:
		       Car c=new Car(new BKSWC("别克商务舱GL8"));
		       list.add(c.CalcRent(days));
		       break;
	      case 2:
		       Car c1=new Car(new BM("宝马550i"));
		       list.add(c1.CalcRent(days));
		       break;
	      case 3:
		       Car c2=new Car(new BKLYDD("别克林荫大道"));
		       list.add(c2.CalcRent(days));
		       break;
		 default:
			 car(days,list);
			 break;
	    	  
	   }

  }
	  public static void bus(int days,List<Integer> list){
		   boolean flag=false;
		   System.out.print("请输入租车类型，"+"1"+"表示金杯客车，"+2+"表示金龙客车:");
		   Scanner s2=new Scanner(System.in);
		   int num1 = s2.nextInt();
		   if(num1==1||num1==2){
			   System.out.print("是否需要大于16座的客车，选择1表示需要：");
			   Scanner s1=new Scanner(System.in);
			   int num2=s1.nextInt();
			   if(num2==1){
				   flag=true;
			   }
		   }
		   switch(num1){
	       case 1:
		       Bus c4=new Bus(new JB(flag,"金杯客车"));
		       list.add(c4.CalcRent(days));
		       break;
	       case 2:
		       Bus c5=new Bus(new JL(flag,"金龙客车"));
		       list.add(c5.CalcRent(days));
			   break;
		  default:
			   bus(days,list);
			   break;
		   
	   }
  }
	public static void main(String[] args) {
	      List<Integer> list=new ArrayList<Integer>();
	      int fee,sumFee=0;
	      //租车
          rentCar(list);
          rentCar(list);
         //租车总费用
  	    for(Iterator iter2=list.iterator();iter2.hasNext();){
	    	fee=(Integer) iter2.next();
            sumFee+=fee;
	    }
        System.out.println("租车总费用为："+sumFee+"元");
   }
}
