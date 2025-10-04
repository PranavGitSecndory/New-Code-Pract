package com.Alpha_dec.Hibernate_alpha_dec;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AllEmpDetails {

    public static void main(String[] args) {
    
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID to retrieve from database:");
        int id = sc.nextInt();

     
        Employee emp = session.get(Employee.class, id);

        
        if (emp != null) {
            System.out.println("ID   : " + emp.getId());
            System.out.println("Name : " + emp.getName());
        } else {
            System.out.println("Employee not found with ID: " + id);
        }

        session.close();
        factory.close();
        sc.close();
    }
}
