package com.bjsxt.bridge;

/**
 * 品牌维度
 * @author Administrator
 *
 */
public interface Brand {

	void sale();
}

class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("联想电脑！");		
	}
}

class Dell implements Brand{
	@Override
	public void sale() {
       System.out.println("戴尔电脑!");
	}
		
}

/**
 * 添加新的品牌
 * @author Administrator
 *
 */
class Shenzhou implements Brand{
	@Override
	public void sale() {
       System.out.println("神舟电脑!");
	}
		
}
