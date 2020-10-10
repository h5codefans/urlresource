package com.bjsxt.state;

/**
 * 已入住的状态
 * @author Administrator
 *
 */
public class CheckedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预订，请勿打扰！");
		
	}
}
