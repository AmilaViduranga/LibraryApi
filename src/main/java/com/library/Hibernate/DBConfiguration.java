package com.library.Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
 * create singleton instance to provide connection to database
 */
public class DBConfiguration {
	private static SessionFactory factory;
	
	private DBConfiguration() {
		
	}

	public static SessionFactory getFactory() {
		try {
			if(factory == null) {
				factory = new Configuration().configure().buildSessionFactory();
			}
			return factory;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}	
}
