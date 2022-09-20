package com.entity;

import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction=null;
		
		try {

			sessionFactory = HibernateUtility.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			
			Instructor instructor=new Instructor();
			instructor.setFirstname("Kiran");
			instructor.setLastname("Das");
			instructor.setEmail("kiran@gmail.com");
			
			
			InstructorDetail instructorDetails=new InstructorDetail();
			instructorDetails.setYoutubeChanel("Coding Ninja");
			instructorDetails.setHobby("Coding");
			
			instructor.setInstructorDetail(instructorDetails);
			
			session.save(instructorDetails);
			session.save(instructor);
			
			transaction.commit();

					
		} 
		
		catch (Exception e) 
		{
			transaction.rollback();
			session.close();
			sessionFactory.close();
			System.out.println(e);
		}

	}


	}


