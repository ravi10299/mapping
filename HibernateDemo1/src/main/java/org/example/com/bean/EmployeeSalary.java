package org.example.com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String manth;
    private double rs;

    public EmployeeSalary( String manth, double rs) {

        this.manth = manth;
        this.rs = rs;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +

                ", manth='" + manth + '\'' +
                ", rs=" + rs +
                '}';
    }
}
