package org.jiwan.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jiwan.hibernatetutorial.dto.Address;
import org.jiwan.hibernatetutorial.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails userDetails=new UserDetails();
		userDetails.setUserName("Name of User");
		Address address=new Address();
		address.setStreet("Street State");
		address.setCity("City Name");
		address.setState("State Name");
		address.setPincode("Pin-Code");
		userDetails.setAddress(address);
				 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession(); 
		session.beginTransaction(); 
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();		

	}

}
