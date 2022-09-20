package com.entity;

import java.util.List;

import com.utility.HibernateUtility;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class AppMain {

	public static void main(String[] args) {
		SessionFactory factory=null;
    	Session session=null;
    	Transaction transaction=null;
    	try
    	{
        factory=HibernateUtility.getSessionFactory();
        session=factory.openSession();
        transaction=session.beginTransaction();
    	
        
		/*
		 * Book b=new
		 * Book("Java Programming","programming","D.C.Sharma",670.0,54675654);
		 * 
		 * session.persist(b); transaction.commit();
		 */
        

        
        Query<Book> query1=session.createQuery("from Book");
       
        
        List<Book> result=query1.list();
        
        
        for(Book b1:result)
        {
        	System.out.println(b1.getAuthor());
        	System.out.println(b1.getBookName());
        	System.out.println(b1.getPrice());
        	 
        }
        
       

    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	Criteria criteria=session.createCriteria(Book.class);
        criteria.add(Restrictions.ne("price",new Double(400)));
        List<Book> books=criteria.list();
        for(Book b:books)
        {
            	System.out.println(b.getPrice()); 
            	System.out.println(b.getBookName());
        }
        
    	//ge,lt,ne,eq
    	
    	
        Query<Book> query=session.createQuery("from Book where bookName like '%java%'");
        books=query.list();
        for(Book b:books)
        {
            	System.out.println(b.getBookName()); 
        }
        
		
			  /*criteria=session.createCriteria(Book.class);
			  criteria.add(Restrictions.between("id",2,3)); 
			  books=criteria.list(); for(Book b:books)
			  { 
				  System.out.println(b); 
			  }
			  */
			    
			 query=session.createQuery("from Book order by price desc ");
		         books=query.list();
		         for(Book b:books)
		         {
		        	 System.out.println(b.getBookName());
		             	System.out.println(b.getPrice()); 
		         }
		         
		         
		         
		    Query aquery=session.createQuery("select max(price) from Book");
		    List<Integer> result=aquery.list(); 
		    System.out.println(result.get(0));
		    
		    
		    
		    NativeQuery<Book> minquery=session.createSQLQuery("select min(price) from Book");
		    List<Book> result1=minquery.getResultList();   
		    System.out.println(result1.get(0));
			 
		    NativeQuery<Book> sumquery=session.createSQLQuery("select sum(price) from Book");
		    List<Book> result2=sumquery.getResultList();   
		    System.out.println(result2.get(0));
		    
		    NativeQuery<Book> avgquery=session.createSQLQuery("select avg(price) from Book");
		    List result3=avgquery.getResultList();   
		    System.out.println(result3.get(0));
    	}
   	
   	
   	
   	

   
 
        
        
 	

      

	}


