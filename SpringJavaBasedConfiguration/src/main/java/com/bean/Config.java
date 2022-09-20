package com.bean;


import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import test.Employee;



@Configuration
	@ComponentScan(basePackages = "com.bean")
	public class Config {
		
		
		@Bean(name = "employee1")
		@Scope("singleton")
		public Employee emp1() {
			return new Employee(101, "Mr Kunal", 2400.3f);
		}

		@Bean(name = "employee2")
		@Scope("prototype")
		public Employee emp2() {
			return new Employee(102, "Mr Rohan", 25000.3f);
		}
		
		  @Bean
		  public RequiredAnnotationBeanPostProcessor getbean() 
		  {
		  RequiredAnnotationBeanPostProcessor r=new RequiredAnnotationBeanPostProcessor(); 
		  return r; 
		  }
	}



