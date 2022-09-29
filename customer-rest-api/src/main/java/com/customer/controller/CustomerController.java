package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") long id)
	{
		return service.getCustomer(id);
	}
	
	
	@PostMapping("/addcustomer")
	public String addCustomer(@RequestBody Customer customer) throws Exception
	{
		return service.addCustomer(customer);
	}
	
	@PutMapping("/updatecustomer")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return service.updateCustomer(customer);
	}
	
	
	
}
