package com.Alpha_dec.Hibernate_alpha_dec;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

       
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        
        SessionFactory factory = cfg.buildSessionFactory();

        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

      
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id number");
        int id = sc.nextInt();
        System.out.println("Enter employee name");
        String name =sc.next();
        
        Employee e1 = new Employee();
        e1.setId(id);
        e1.setName(name);

      
        session.save(e1);

       
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Your data has been successfully inserted...");
    }
}
