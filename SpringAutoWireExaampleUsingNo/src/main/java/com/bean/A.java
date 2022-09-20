package com.bean;

public class A 
{
	private int id;
	private String message;
	private B b;
	public B getB() {
		return b;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	public A()
	{
		
	}
	public A(int id, String message,B b) {
		super();
		this.id = id;
		this.message = message;
		this.b=b;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
