package com.example.demo.exception;

public class ProductNotFoundException extends RuntimeException
{
	public ProductNotFoundException(String s)
	{
		super(s);
	}
}
