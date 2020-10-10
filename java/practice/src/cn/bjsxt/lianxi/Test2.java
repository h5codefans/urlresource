package cn.bjsxt.lianxi;

public class Test2 {
    public static void main(String[] args){
          MyPoint m=new MyPoint();
          m.setX(3);
          m.setY(6);
          System.out.println(m.toString());       
    }
}
    class MyPoint{
    	private int x;
    	private int y;
    	public int getX(int x){
    		return x;
    	}
    	public int getY(int y){
    		return y;
    	}
    	public void setX(int x){
    		this.x=x;
    	}
    	public void setY(int y){
    		this.y=y;
    	}
    	public String toString(){
    		return "X的值为："+x+" "+",Y的值为："+y;
    	}
}
