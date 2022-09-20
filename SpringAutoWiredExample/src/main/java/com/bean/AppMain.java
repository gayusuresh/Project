package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	        TextEditor t=(TextEditor) context.getBean("textEditor");
	        
	        t.getSpellChecker().checkSpelling();

	}

}
