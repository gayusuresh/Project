package com.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(NoSuchCustomerFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public @ResponseBody ErrorResponse handleNoSuchCustomerExist(NoSuchCustomerFoundException ex)
	{
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());
	}
	
	
	@ExceptionHandler(CustomerAlreadyExistException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public @ResponseBody ErrorResponse handleCustomerAlreadyExistException(CustomerAlreadyExistException ex)
	{
		return new ErrorResponse(HttpStatus.CONFLICT.value(),ex.getMessage());
	}
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleGeneralException(Exception ex)
	{
		return new ErrorResponse(HttpStatus.BAD_REQUEST.value(),ex.getMessage());
	}
	
}
