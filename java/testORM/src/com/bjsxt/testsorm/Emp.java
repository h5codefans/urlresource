package com.bjsxt.testsorm;

import java.sql.Date;

public class Emp {     //表结构和类对应
     private Integer id;
     private String empnaem;
     private Integer age;
     private Double salary;
     private Date birthday;
     private Integer deptId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpnaem() {
		return empnaem;
	}
	public void setEmpnaem(String empnaem) {
		this.empnaem = empnaem;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Emp(Integer id, String empnaem, Integer age, Double salary,
			Date birthday, Integer deptId) {
		super();
		this.id = id;
		this.empnaem = empnaem;
		this.age = age;
		this.salary = salary;
		this.birthday = birthday;
		this.deptId = deptId;
	}
	public Emp(String empnaem, Integer age, Double salary, Date birthday,
			Integer deptId) {
		super();
		this.empnaem = empnaem;
		this.age = age;
		this.salary = salary;
		this.birthday = birthday;
		this.deptId = deptId;
	}
     
    public Emp(String empnaem,Double salary, Integer age ) {
		super();
		this.empnaem = empnaem;
		this.age = age;
		this.salary = salary;
	}
	public Emp() {

	} 
}
