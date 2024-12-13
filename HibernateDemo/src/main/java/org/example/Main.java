package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration cfg =new Configuration();

        System.out.println(1);

        cfg.configure();

        System.out.println(2);

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction =session.beginTransaction();


        Student s0 = new Student(2,"ravindra",70);
        Student s2 = new Student(3,"shshai",70);
        Student s3 = new Student(4,"rahit",70);
        Student s4 = new Student(5,"gaurav",70);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s0);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student str :students){
            session.save(str);
        }

        transaction.commit();


        System.out.println("table is create successful");

    }
}