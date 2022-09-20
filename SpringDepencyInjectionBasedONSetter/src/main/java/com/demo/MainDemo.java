package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainDemo {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Book book=(Book)factory.getBean("BookBean");  
	    System.out.println(book.getBookid()); 
	    System.out.println(book.getBookname());  

	    System.out.println(book.getAuthor());  
        System.out.println("===============================================");
       Book book1=(Book)factory.getBean("BookBean1");  
      System.out.println(book.getBookid()); 
      System.out.println(book.getBookname());  
      System.out.println(book.getAuthor());  
      System.out.println("===============================================");  
      Book book2=(Book)factory.getBean("book1");  
      System.out.println(book2.getBookid()); 
      System.out.println(book2.getBookname());  
      System.out.println(book2.getAuthor()); 

	}

}
