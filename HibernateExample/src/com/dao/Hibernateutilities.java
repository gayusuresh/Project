package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
;

@SuppressWarnings("deprecation")
public class Hibernateutilities {
private static SessionFactory sessionFactory;
private static ServiceRegistry serviceRegistry;

static
{
try{
	Configuration configuration = new Configuration().configure();
	serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
catch(HibernateException exception)
{
	exception.printStackTrace();
	System.out.println("Problem creating session Factory" + exception.getMessage());
}

}
public static SessionFactory getSessionFactory()
{
	return sessionFactory;
}

public static SessionFactory createSessionFactory() {
Configuration configuration = new Configuration();
configuration.configure();
serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
sessionFactory = configuration.buildSessionFactory(serviceRegistry);
return sessionFactory;
}

}


