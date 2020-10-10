package cn.bjsxt.test;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 测试窗口物体沿着任意角度飞行
 * 最后实现一个小的台球游戏
 * @author Administrator
 *
 */
public class GameFrame5 extends MyFrame {   //GUI编程：AWT,swing等
    
	Image img=GameUtil.getImage("images/sun.jpg");
	
	
	
	private double x=100,y=100;
	private double degree=3.14/3;       //[0,2pi];
	private double speed=10;
	@Override
	public void paint(Graphics g) {
         g.drawImage(img, (int)x,(int)y, null);
         
         if(speed>0){
        	 speed-=0.05;
         }else{
        	 speed=0;
         }
         x+=speed*Math.cos(degree);
         y+=speed*Math.sin(degree);
         
         if(y<30||y>(500-30)){
        	 degree=-degree;
         }
         if(x<0||x>(500-30)){
        	 degree=Math.PI-degree;
         }
	}

  
	
	public static void main(String[] args){
		GameFrame5 gf=new GameFrame5();
	    gf.launchFrame();
	}
}
