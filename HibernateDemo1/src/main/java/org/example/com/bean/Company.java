package org.example.com.bean;


import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;


@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String type;
    private  String address;

    @OneToMany
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private List<EmployeeSalary> employee_Employee_Salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EmployeeSalary> getEmployee_Salary() {
        return employee_Employee_Salary;
    }

    public void setEmployee_Salary(List<EmployeeSalary> employee_Employee_Salary) {
        this.employee_Employee_Salary = employee_Employee_Salary;
    }
}
