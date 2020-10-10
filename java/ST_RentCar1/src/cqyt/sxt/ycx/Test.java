package cqyt.sxt.ycx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 * 余常鑫
 * @author Administrator
 *
 */
public class Test {
   public static void main(String[] args) {
	      List list=new ArrayList();
	      int fee,sumFee=0;
          rentCar(list);
          rentCar(list);
  	    for(Iterator iter2=list.iterator();iter2.hasNext();){
	    	fee=(Integer) iter2.next();
            sumFee+=fee;
	    }
        System.out.println("租车总费用为："+sumFee);
   }
   public static void rentCar(List list){
	   System.out.print("请输入租车天数：");
	   Scanner s=new Scanner(System.in);
       int days=s.nextInt();
	   while(true){
		   System.out.print("请输入租车类型，"+"1"+"表示轿车，"+2+"表示客车:");
		   int type=s.nextInt();
		   if(type==1){
               car1(days,list);
               break;
		   }else if(type==2){
               car2(days,list);
               break;
		   }
	   }
   }
   public static void car1(int days,List list){ 
	  System.out.print("请输入租车车型,"+1+",表示别克商务舱GL8，"+2+"表示宝马550i，"+3+"表示别克林荫大道：");
	  Scanner s1=new Scanner(System.in);
	  int num = s1.nextInt();
 	  switch(num){
	      case 1:
		       Car c=new Car(new BKSWC());
		       list.add(c.CalcRent(days));
		       break;
	      case 2:
		       Car c1=new Car(new BM());
		       list.add(c1.CalcRent(days));
		       break;
	      case 3:
		       Car c2=new Car(new BKLYDD());
		       list.add(c2.CalcRent(days));
		       break;
		 default:
			 car1(days,list);
			 break;
	    	  
	   }

  }
	  public static void car2(int days,List list){
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
		       Bus c4=new Bus(new JB());
		       Bus p=new Bus(flag);
		       list.add(c4.CalcRent(days));
		       break;
	       case 2:
		       Bus c5=new Bus(new JL());
		       Bus p1=new Bus(flag);
		       list.add(c5.CalcRent(days));
			   break;
		  default:
			   car2(days,list);
			   break;
		   
	   }
  }
}


