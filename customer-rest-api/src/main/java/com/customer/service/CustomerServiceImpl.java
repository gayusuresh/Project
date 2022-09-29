package com.customer.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.exception.CustomerAlreadyExistException;
import com.customer.exception.NoSuchCustomerFoundException;
import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	@Override
	public Customer getCustomer(long id) {
		
		return  repository.findById(id).orElseThrow(
		         () 
		           -> new NoSuchElementException("No customer present with id "+id));	
	}

	@Override
	public String addCustomer(Customer customer) {
		
		Customer existingCustomer=repository.findById(customer.getId()).orElse(null);
		if(existingCustomer==null)
		{
			repository.save(customer);
			return "Customer added successfully";
		}
		else
		{
			throw new CustomerAlreadyExistException("Customer already exist!!");
		}

	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer existingCustomer=repository.findById(customer.getId()).orElse(null);
		if(existingCustomer==null)
		{
			throw new NoSuchCustomerFoundException("No such customer exist!!");
		}
		else
		{
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			
			repository.save(existingCustomer);
			return "Record Updated!!";
		}
	}

}
