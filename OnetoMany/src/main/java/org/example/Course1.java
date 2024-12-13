package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course1 {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "Course_price")
    private Double price;




    public Course1(String courseName, Double price) {
        this.courseName = courseName;
        this.price = price;
    }
}
