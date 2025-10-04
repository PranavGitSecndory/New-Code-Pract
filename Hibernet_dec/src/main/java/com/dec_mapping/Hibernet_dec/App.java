package com.dec_mapping.Hibernet_dec;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
       
        Question Qu = new Question();
        Qu.setQueId(1);
        Qu.setQues("What is java");
        
        Answer an = new Answer();
        an.setAnsId(101);
        an.setAns("java is programing lanuage");
        
        
        Qu.setAnswer(an);
        session.save(Qu);
        
        tx.commit();
        session.close();
        factory.close();
        
        System.out.println("Your data been sucessfully inserted....");
    }
}