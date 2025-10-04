package com.Add_Ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Student st = new Student();
        Address ad = new Address();
        
        st.setId(1);
        st.setName("nikhil");
        ad.setCity("pune");
        ad.setConutry("India");
        
        st.setAd(ad);
        session.save(st);
        
        tx.commit();
        session.close();
        factory.close();
        
        System.out.println("Your data been sucessfully inserted....");
		
	}

}