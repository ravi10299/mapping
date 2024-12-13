package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Employee_info")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    @Column(name = "employee_name")
    private String name;
    @Column(name = "employee_company")
    private String company;
    @Column(name = "employee_salary")
    private Double salary;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")//foreign key in department table..............
    private List<DepartmentOfCompany> department =new ArrayList<>();

    public Employee( String name, String company, Double salary) {

        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public List<DepartmentOfCompany> getDepartment() {
        return department;
    }

    public void setDepartment(List<DepartmentOfCompany> department) {
        this.department = department;
    }
}
