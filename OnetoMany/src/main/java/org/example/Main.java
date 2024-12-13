package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("One to Many Example");

        // Configure Hibernate
        Configuration configuration = new Configuration();
        configuration.configure(); // Ensure hibernate.cfg.xml is correctly set up
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Create Course instances
            Course1 javaCourse = new Course1("Java", 5000.00);
            Course1 cppCourse = new Course1("C++", 4000.00);
            Course1 csharpCourse = new Course1("C#", 3000.00);

            // Create Student instances
            Student student1 = new Student("Rohit Sharma", "DU University", "Delhi");
            student1.setCourse(List.of(javaCourse, cppCourse, csharpCourse));

            Student student2 = new Student("Virat Kohli", "PU University", "Chandigarh");
            student2.setCourse(List.of(javaCourse, cppCourse, csharpCourse));

            // Persist students (and their courses)
            session.save(student1);
            session.save(student2);

            transaction.commit();
            System.out.println("Data saved successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }
}
