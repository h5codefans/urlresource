package cn.itcast.domain;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Person
{

	private String name;
	private String password;
	private int age;
	private Date birthday;
	private Address address;

	public Person()
	{
		name = "aaa";
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}
}
