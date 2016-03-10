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
		
		Address homeAddress=new Address();
		homeAddress.setStreet("Home Street Name");
		homeAddress.setCity("Home City Name");
		homeAddress.setState("Home State Name");
		homeAddress.setPincode("Home Pin-Code");
		
		Address officeAddress=new Address();
		officeAddress.setStreet("Office Street State");
		officeAddress.setCity("Office City Name");
		officeAddress.setState("Office State Name");
		officeAddress.setPincode("Office Pin-Code");
		
		userDetails.setHomeAddress(homeAddress);
		userDetails.setOfficeAddress(officeAddress);
				 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession(); 
		session.beginTransaction(); 
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();		

	}

}
