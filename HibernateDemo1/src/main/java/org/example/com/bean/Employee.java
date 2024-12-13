package org.example.com.bean;

import jakarta.persistence.*;

@Entity

public class Employee {
    @Id
    @Column(name ="employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "employee_name")
    private  String name;
    @Column(name="employee_company")
    private String company;
    @Column(name = "employee_salary")
    private double salary;

    public Employee(int id, String name, String company, double salary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
