package com.bjsxt.adapter;

/**
 * 适配器(类适配器方式)
 * (相当于USB和ps/2的转换器)
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target{
  
	@Override
	public void handleReq() {
		super.request();
	}
}
