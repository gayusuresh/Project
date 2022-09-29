package com.customer.exception;

public class NoSuchCustomerFoundException extends RuntimeException {

	private String message;

	public NoSuchCustomerFoundException() {
		
	}

	public NoSuchCustomerFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
