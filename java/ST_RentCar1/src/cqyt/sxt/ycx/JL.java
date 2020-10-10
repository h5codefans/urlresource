package cqyt.sxt.ycx;

//金龙客气
public class JL extends Bus{
	public  int CalcRent(int days) {
	       if(!Bus.flag){
	    	   System.out.println("金杯客车小于16座，租用"+days+"天，租金:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println("金杯客车大于16座，租用"+days+"天，租金:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}
