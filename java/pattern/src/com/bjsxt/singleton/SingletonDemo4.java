package com.bjsxt.singleton;

/**
 * 测试枚举式实现单例模式(没有延时加载,线程安全，调用效率高，并且可以天然的防止反射和发序列化漏洞)
 * @author Administrator
 *
 */
public enum SingletonDemo4 {
    //这个枚举元素，本身就是单例对象！
	INSTANCE;
	
	//添加自己需要的操作！
	public void singletonOperation(){
		
	}
	
}
