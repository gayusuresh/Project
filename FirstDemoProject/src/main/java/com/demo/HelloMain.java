package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService obj = context.getBean(HelloService.class);
		obj.display();
		context.close();


	}

}
