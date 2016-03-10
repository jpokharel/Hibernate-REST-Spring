package org.jiwan.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jiwan.hibernatetutorial.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails userDetails=new UserDetails();
		userDetails.setUserName("Y. Paltan.");
		
		UserDetails userDetails2=new UserDetails();
		userDetails2.setUserName("M. Paltan.");
		
				 
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession(); 
		session.beginTransaction(); 
		session.save(userDetails);
		session.save(userDetails2);
		session.getTransaction().commit();
		
		
		
		
		

	}

}
