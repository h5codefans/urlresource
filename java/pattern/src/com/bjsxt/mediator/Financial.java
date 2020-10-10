package com.bjsxt.mediator;

public class Financial implements Department{

	private Mediator m;        //持有中介者(总经理)的应用
	
	
	public Financial(Mediator m) {
		super();
		this.m = m;
		m.register("financial", this);
	}
	@Override
	public void outAction() {
		System.out.println("汇报工作！钱太多了！怎么花？");
		
	}
	@Override
	public void selfAction() {
		System.out.println("数钱！");

	}
}
