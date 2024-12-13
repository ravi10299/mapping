package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(1);
        Configuration configuration = new Configuration();
        configuration.configure();
        System.out.println(2);
        SessionFactory sessionFactory  = configuration.buildSessionFactory();
        System.out.println(3);
        Session session  = sessionFactory.openSession();
        System.out.println(4);
        Transaction transaction = session.beginTransaction();
        System.out.println(5);
        Student2 s = new Student2(1,"patel","sss","rahania");
        Student2 s1 = new Student2(2,"patel1","ssss","rahania");
        Student2 s2 = new Student2(3,"patel2","ssss","rahania");
        ArrayList<Student2> student = new ArrayList<>();
        student.add(s);
        student.add(s1);
        student.add(s2);
        for (Student2 std:student){
            session.save(std);
        }
        transaction.commit();

    }
}