package cn.bjsxt.plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import cn.bjsxt.until.GameUtil;

public class Plane extends GameObject {

	 private boolean left,up,right,down;
	 private int speed=10;
	 private boolean live=true;
	 
	    public void draw(Graphics g){
	    	if(live){
		    	g.drawImage(img, (int)x, (int)y, null);
		    	move();
	    	}
	    }

		public Plane(String imgpath, double x, double y) {
			this.img =GameUtil.getImage(imgpath);
			this.width=img.getWidth(null);
			this.height=img.getHeight(null);
			this.x = x;
			this.y = y;
		}
	    public Plane(){
	    	
	    }
	    public boolean isLive() {
			return live;
		}

		public void setLive(boolean live) {
			this.live = live;
		}

		public void move(){
            if(left){
            	x-=speed;
            }
            if(right){
            	x+=speed;
            }
            if(up){
            	y-=speed;
            }
            if(down){
            	y+=10;
            }
	    }
	    
	    public void addDirection(KeyEvent e){
	    	switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				left=true;
				  break;
			case 38:
			    up=true;
				  break;
			case 39:
				right=true;
				  break;
			case 40:
				down=true;
				  break;
			default:
				  break;
			}
	    }
	    
	    public void minusDirection(KeyEvent e){
	    	switch(e.getKeyCode()){
			case KeyEvent.VK_LEFT:
				left=false;
				  break;
			case 38:
				up=false;
				  break;
			case 39:
				right=false;
				  break;
			case 40:
				down=false;
				  break;
			default:
				  break;
			}
	    }
}
