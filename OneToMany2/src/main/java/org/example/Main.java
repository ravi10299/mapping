package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("********1********");


        Configuration configuration = new Configuration();
        System.out.println("********2*******");
        configuration.configure();
        System.out.println("********3********");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();

            System.out.println("*******4*******");
            DepartmentOfCompany department = new DepartmentOfCompany("java developer");


            Employee employee1 = new Employee("minton","mitlon",50000.0);
            employee1.setDepartment(List.of(department));

            System.out.println("*******5*******");

            session.save(employee1);

            transaction.commit();

            System.out.println("data save successfully");



        }catch (Exception e){
            e.fillInStackTrace();
            System.out.println(e);
        }finally {
            sessionFactory.close();
        }



    }
}