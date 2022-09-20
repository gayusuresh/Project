package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private String name;
	private Address add;
	
	public Student()
	{
		
	}
    @Autowired
	public Student(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	
	

}
