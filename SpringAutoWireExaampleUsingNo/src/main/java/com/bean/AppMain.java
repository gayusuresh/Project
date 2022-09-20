package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        
        A a=(A) context.getBean("a");
        
        System.out.println(a.getId());
        System.out.println(a.getMessage());
        System.out.println(a.getB().getId());
        System.out.println(a.getB().getMessage());


	}

}
