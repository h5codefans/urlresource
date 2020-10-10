package com.bjsxt.state;

/**
 * 预定状态
 * @author Administrator
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预订！");
		
	}
}
