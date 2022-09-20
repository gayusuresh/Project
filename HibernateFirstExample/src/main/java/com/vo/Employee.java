package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="employeeid")
	private int employeeid;
	@Column(name="employeename")
	@Length(min=3, max=5, message="employee name should be between 5 - 10 charactes")
	private String employeename;
	@Column(name="contact")
	@NotNull
	 
    @Pattern(regexp="[0-9]+", message="Wrong zip!")
	private long contact;
	public Employee()
	{
		
	}
	public Employee(int employeeid, String employeename, long contact) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.contact = contact;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	

}
