package cn.itcast.eclipse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 用JUnit测试方法
 * 
 * @author Administrator
 * 
 */

//person测试类
public class JUnit {

	@Before
	public void before(){
		System.out.println("before");
	}
	@Test
	public void testRun() {
		Person p = new Person();
		p.testRun();
	}

	@Test
	public void testEat() {
		Person p = new Person();
		p.testEat();
	}
	@After
	public void after(){
		System.out.println("after");
	}
}