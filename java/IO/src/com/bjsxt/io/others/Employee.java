package com.bjsxt.io.others;

import java.io.Serializable;
/**
 * 空接口只是标识
 * @author Administrator
 *
 */
public class Employee implements Serializable {
      private transient String name;     //该属性不需要序列化
      private double salary;
      
      public Employee() {
	
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
}
