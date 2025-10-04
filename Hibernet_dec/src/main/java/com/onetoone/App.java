package com.onetoone;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dec_mapping.Hibernet_dec.Answer;
import com.dec_mapping.Hibernet_dec.Question;

public class App 
{
	public static void main(String[] args)
	{
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Question1 q1 = new Question1();
        q1.setQue_id(1001);
        q1.setQuestion("What is Class ?");
        
        Answer1 a1 = new Answer1();
        a1.setAns_id(501);
        a1.setAnswer("Class is blueprint of real world object");
        
        q1.setAnswer(a1);
        a1.setQuestion(q1);
        
        session.save(q1);
        session.save(a1);
        
        tx.commit();
        
        factory.close();
        session.close();
        
        System.out.println("BiDirectional Data added succesfully...");
	}
}