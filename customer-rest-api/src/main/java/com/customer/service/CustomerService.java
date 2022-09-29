package com.customer.service;

import com.customer.model.Customer;

public interface CustomerService {
	
	//method to get customer by id
	Customer getCustomer(long id);
	
	//method to add new customer
	String addCustomer(Customer customer) throws Exception;

	//method to update customer details
	String updateCustomer(Customer customer);
	
}
