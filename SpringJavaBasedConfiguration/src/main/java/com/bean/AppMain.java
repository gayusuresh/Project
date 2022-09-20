package com.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {

	public static void main(String[] args) {
	       AbstractApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	       System.out.println(context.getBean("employee1").hashCode());
	       System.out.println(context.getBean("employee2").hashCode());


	}

}
