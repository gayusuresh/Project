package com.entity;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
        Configuration cfg=new Configuration().addResource("book.hbm.xml").configure("hibernate.cfg.xml");
        
        StandardServiceRegistryBuilder sb=new StandardServiceRegistryBuilder();
        sb.applySettings(cfg.getProperties());
        StandardServiceRegistry registery=sb.build();
        
        
       SessionFactory factory=cfg.buildSessionFactory(registery);
       Session session=factory.openSession();
       Transaction t=session.beginTransaction();
       
       
	
		// Book b=new
		// Book(4567,"English story book","Short stories","B.Roy",348.00,45435435);
		 
		 // session.save(b); 
			/*
			 * Book b1=session.get(Book.class, 4567L); System.out.println(b1.getBookName());
			 * System.out.println(b1.getAuthor());
			 */
       
	       //Book b1=session.load(Book.class, 4567l);
	      
	       //session.delete(b1);
	       
	       Book b3=new Book(4566,"ABC story book","Short stories","A.Roy",348.00,45435435);
	       
	       session.save(b3);
	       
	      b3.setPrice(780.0);
	      b3.setBookType("Novel");
	      
	      //HQL - Hibernante Query Language
	      session.update(b3);
	       

       t.commit();
       
    session.close();

	}

}
