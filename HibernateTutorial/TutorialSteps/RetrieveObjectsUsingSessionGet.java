package org.jiwan.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jiwan.hibernatetutorial.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		//Instantiates the model class here
		UserDetails userDetails=new UserDetails();
		userDetails.setUserId(751); //Set the member variable values for the model class.
		userDetails.setUserName("Y. Paltan.");
		userDetails.setAddress("This is the address of the user");
		userDetails.setDateJoined(new Date());
		userDetails.setDescription("This field contains the description of the user");
		
		 //Create the session factory. It is expensive, so created only once.
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession(); //Create and open the session.
		session.beginTransaction(); //Perform the CRUD transaction here.
		session.save(userDetails);
		session.getTransaction().commit();
		session.close(); //To close the above session. Usually included in "Finally" block.
		
		//To reUse the SessionFactory
		userDetails=null;
		
		//Open a new Session
		session=sessionFactory.openSession(); //Create and open the session.
		session.beginTransaction();
		userDetails=(UserDetails) session.get(UserDetails.class, 251); //To reassign new value to session user.
		
		//To fetch the details of the above created User
		
		System.out.println("User Name: "+userDetails.getUserName()+
				" Address is: "+userDetails.getAddress());
		
		

	}

}
