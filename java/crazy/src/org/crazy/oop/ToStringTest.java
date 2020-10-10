package org.crazy.oop;

class Apple {
	private String color;
	private double weight;

	public Apple() {

	}

	public Apple(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	// 重新toString方法
	public String toString() {
		return "一个苹果的颜色为：" + color + ",重量为：" + weight;
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		Apple apple = new Apple("红色", 3.23);
		System.out.println(apple);// 等价于System.out.println(apple.toString());

	}

}
