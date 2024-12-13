package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student2 {
    @Id
    private int id;
    private String name;
    private String college;
    private String address;

    public Student2(int id, String name, String college, String address) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
