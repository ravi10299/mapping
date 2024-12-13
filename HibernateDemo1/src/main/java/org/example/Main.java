package org.example;

import org.example.com.bean.Company;
import org.example.com.bean.Employee;
import org.example.com.bean.Employee1;
import org.example.com.bean.EmployeeSalary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration configuration = new Configuration();

        System.out.println(1);
        configuration.configure();
        System.out.println(2);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        System.out.println(3);
        Session session = sessionFactory.openSession();
        System.out.println(4);



        Transaction transaction = session.beginTransaction();

        //add salary..
        EmployeeSalary es = new EmployeeSalary("jan",250000);
        EmployeeSalary es1 = new EmployeeSalary("jan",230000);
        EmployeeSalary es2 = new EmployeeSalary("jan",220000);


        ArrayList<EmployeeSalary> l1= new ArrayList<>();
        l1.add(es);

        ArrayList<EmployeeSalary> l2 = new ArrayList<>();
        l2.add(es1) ;

        ArrayList<EmployeeSalary> l3 = new ArrayList<>();
        l2.add(es2);

        //add company....

        Company company = new Company();
        company.setName("infosys");
        company.setType("mnc");
        company.setAddress("noida");
        company.setEmployee_Salary(l1);


        Company company1 = new Company();
        company1.setName("wipro");
        company1.setType("mnc");
        company1.setAddress("delhi");
        company1.setEmployee_Salary(l3);


        ArrayList<Company> mmm=new ArrayList<>();
        mmm.add(company);
        mmm.add(company1);

        System.out.println(5);
        //employee1
        Employee1 e1 =new Employee1("patel","bhadoi");
        e1.setCompanyName(mmm);


        //employee2
        Employee1 e2 =new Employee1("ravindra","bhadoi");
        e2.setCompanyName(mmm);

        ArrayList<Employee1> listEmployee = new ArrayList<>();
        listEmployee.add(e1);
        listEmployee.add(e2);

        for (Employee1 emp:listEmployee){
            session.save(emp);
            System.out.println(6);
        }

        System.out.println(7);

        transaction.commit();

        System.out.println("table is created");

        System.out.println("save data to the database");





    }
}