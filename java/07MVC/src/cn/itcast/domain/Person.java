package cn.itcast.domain;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Person {
   
	private String name="aaaaaa";
	private int age;
	private Date birthday;
	
	private Address address;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
