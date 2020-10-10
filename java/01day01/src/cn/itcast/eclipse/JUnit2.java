package cn.itcast.eclipse;

import org.junit.Assert;
import org.junit.Test;

/**
 * 用JUnit测试方法
 * 
 * @author Administrator
 * 
 */

//person测试类
public class JUnit2 {


	@Test
	public void testRun() {
		Person p = new Person();
		p.testRun();
		
		//断言
		//Assert.assertEquals("1",p.testRun());
		//Assert.assertArrayEquals(new int[]{1,1},new int[]{1,2});
		
		Assert.assertTrue(true);
	}

	@Test
	public void testEat() {
		Person p = new Person();
		p.testEat();
	}
}