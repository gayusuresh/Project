package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	        Student s=(Student) context.getBean("student");
	        
	        System.out.println(s.getName());
	        System.out.println(s.getAdd().getAddress());

	}

}
