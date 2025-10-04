package com.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Arrays;

public class App_ManyToManyMapping {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Course c1 = new Course();
        c1.setCou_RollNo(1);
        c1.setCou_name("Python");

        Course c2 = new Course();
        c2.setCou_RollNo(2);
        c2.setCou_name("Java");

        Student s1 = new Student();
        s1.setStu_RollNo(101);
        s1.setStu_name("Nikhil");

        Student s2 = new Student();
        s2.setStu_RollNo(102);
        s2.setStu_name("Ketan");

        Student s3 = new Student();
        s3.setStu_RollNo(103);
        s3.setStu_name("Divesh");

        // Set relationships
        s1.setLi(Arrays.asList(c1, c2));
        s2.setLi(Arrays.asList(c1));
        s3.setLi(Arrays.asList(c2));

        // Save students (courses will also be saved due to CascadeType.ALL)
        session.save(s1);
        session.save(s2);
        session.save(s3);

        tx.commit();
        session.close();
        factory.close();
    }
}
