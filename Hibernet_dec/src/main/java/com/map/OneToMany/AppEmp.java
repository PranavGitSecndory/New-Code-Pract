package com.map.OneToMany;



import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppEmp {
    public static void main(String[] args) {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

      
        Company company = new Company();
        company.setCompId(2);
        company.setCompName("TCS");

        Company company1 = new Company();
        company1.setCompId(3); 
        company1.setCompName("enzigma"); 

        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setEmpName("Nikhil");
        emp1.setCompany(company);

        Employee emp2 = new Employee();
        emp2.setEmpId(102);
        emp2.setEmpName("sagar");
        emp2.setCompany(company);

        Employee emp3 = new Employee();
        emp3.setEmpId(103);
        emp3.setEmpName("ketan");
        emp3.setCompany(company);

        Employee emp4 = new Employee();
        emp4.setEmpId(204);
        emp4.setEmpName("divesh");
        emp4.setCompany(company1);

        Employee emp5 = new Employee();
        emp5.setEmpId(205);
        emp5.setEmpName("darshan");
        emp5.setCompany(company1);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        List<Employee> empList01 = new ArrayList<>();
        empList01.add(emp4);
        empList01.add(emp5);

        company.setList(empList);
        company1.setList(empList01);

        
        session.save(company);
        session.save(company1);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("✅ Your data has been successfully inserted...");
    }
}