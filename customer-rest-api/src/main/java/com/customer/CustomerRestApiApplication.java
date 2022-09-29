package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customer.model.Customer;

@SpringBootApplication
public class CustomerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApiApplication.class, args);
		
		/*
		 * Customer c=new Customer(); c.setId(123); c.setAddress("kolkata");
		 * c.setName("Arun");
		 * 
		 * System.out.println(c.getId() + c.getName() + c.getAddress());
		 */
	}

}
