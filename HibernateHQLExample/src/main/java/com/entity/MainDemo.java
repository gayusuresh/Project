package com.entity;

import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainDemo {

	public static void main(String[] args) {
		try {

			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
				
	
			  Instructor instructor=new Instructor("Malini", "Roy", "malini@gmail.com");
			  
			  Course course1=new Course("C for beginners"); 
			  Course course2=new Course("First Head Spring");
			  
			  List<Course> courses=new ArrayList<Course>(); 
			  courses.add(course1);
			  courses.add(course2);
			  
			  
			  instructor.setCourses(courses);
			  
			  course1.setInstructor(instructor); 
			  course2.setInstructor(instructor);
			  
			  
			  session.save(instructor);
			 
			  //session.save(course1);
			  //session.save(course2);
			 


	}

}
