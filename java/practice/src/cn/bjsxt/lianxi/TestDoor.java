package cn.bjsxt.lianxi;

public class TestDoor {
  
  public static void display(Door f){
	  f.openDoor();
	  if(f instanceof FDoor){
		  ((FDoor) f).theftproof();
	  }
  }
  public static void main(String[] args) {
	  Door f=new FDoor();
	  display(f);
   }
}
