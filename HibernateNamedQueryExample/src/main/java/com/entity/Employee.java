package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findEmployeeByName",  
	        query = "from Employee e where e.name = :name"  
	        )  
	    }  
	)  

@Entity
@Table(name="employeedetails")
public class Employee
{
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	@Column(name="job")
	private String job;
	public Employee()
	{
		
	}
	public Employee(int id, String name, int salary, String job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
