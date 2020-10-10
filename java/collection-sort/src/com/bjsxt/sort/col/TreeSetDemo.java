package com.bjsxt.sort.col;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * 提供了解耦的方式：业务类排序
 * @author Administrator
 *
 */
public class TreeSetDemo {
   public static void main(String[] args) {
	Person p1=new Person("您",100);
	Person p2=new Person("刘德华",1000);
	Person p3=new Person("梁朝伟",1200);
	Person p4=new Person("老裴",50);
	
	//依次存放到容器中,使用排序的业务类(匿名内部类)
	TreeSet<Person> persons=new TreeSet<Person>(
			 new Comparator<Person>() {
				@Override
				public int compare(Person o1,Person o2){
					return o1.getHandsome()-o2.getHandsome();
				}
			}
			);
	persons.add(p1);
	//TreeSet 在添加数据时排序
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	
	System.out.println(persons);
	
	/*
	//改变数据
	p3.setHandsome(-100);
	*/
	System.out.println(persons);
}
}
