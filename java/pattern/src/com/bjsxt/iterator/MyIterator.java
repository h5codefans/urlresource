package com.bjsxt.iterator;

/**
 * 自定义的迭代器接口
 * @author Administrator
 *
 */
public interface MyIterator {

	void first();
	void next();
	boolean hasNext();
	
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();         //获取当前邮编指向的对象
}
