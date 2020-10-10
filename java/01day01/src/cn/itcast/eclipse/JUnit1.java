package cn.itcast.eclipse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 用JUnit测试方法
 * 
 * @author Administrator
 * 
 */

//person测试类
public class JUnit1 {

	@BeforeClass
	public static void beforeclass(){
		System.out.println("beforeclass");
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
	@AfterClass
	public static void afterclass(){
		System.out.println("afterclass");
	}
}