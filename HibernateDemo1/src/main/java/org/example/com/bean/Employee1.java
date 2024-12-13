package org.example.com.bean;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    @OneToMany()
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private List<Company> companyName;
    @OneToMany()
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private List<EmployeeSalary> employeeSalary_id;

public Employee1(){

}

    public Employee1( String name, String address) {

        this.name = name;
        this.address = address;


    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", companyName=" + companyName +
                '}';
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Company> getCompanyName() {
        return companyName;
    }

    public void setCompanyName(List<Company> companyName) {
        this.companyName = companyName;
    }
}
