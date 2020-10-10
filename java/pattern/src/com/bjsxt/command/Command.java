package com.bjsxt.command;

public interface Command {

	/**
	 * 这个方法是一个返回结果为空的方法。
	 */
	
	void execute();
}

class ConcreteCommand implements Command{
	
	private Receiver receiver;    //命令的真正执行者
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		//命令真正执行前或后，执行相关处理！
		receiver.action();
		
	}
}