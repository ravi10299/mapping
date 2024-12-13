package org.example;

import jakarta.persistence.*;

@Entity
@Table(name = "Department")
public class DepartmentOfCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Department_info")
    private String department;

    public DepartmentOfCompany( String department) {

        this.department = department;
    }
}
