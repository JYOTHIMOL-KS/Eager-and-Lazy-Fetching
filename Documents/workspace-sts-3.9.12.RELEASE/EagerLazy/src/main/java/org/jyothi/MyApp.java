package org.jyothi;

import org.hibernate.Transaction;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) {
		
		
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Alien a1=session.get(Alien.class, 1); //simply fetching data from database
		System.out.println(a1.getLaptop());
		System.out.println(a1.getAname());
		/*
		 *        LAZY FETCHING
		 * 
		 * Collection<Laptop> laptop=a1.getLaptop();  //if we don't write this it will not any query for laptop, even alien have multiple laptops
		for(Laptop l: laptop) {                   //LAZY LOADING, WE NEED TO WRITE SEPERATE COMMAND FOR LAPTOP AND ALIEN
			System.out.println(l);
		}
		*/
		tx.commit();
	

	}

}
