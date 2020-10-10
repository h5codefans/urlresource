package com.bjsxt.po;

public class User {

	private String name;
	private String phone;
	private Integer age;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, String phone, Integer age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
