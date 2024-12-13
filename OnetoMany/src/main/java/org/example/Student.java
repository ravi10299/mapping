package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_id")
    private  int id;
    @Column(name = "Student_name")
    private String name;
    @Column(name = "Student_college")
    private String college;
    @Column(name = "Student_")
    private  String address;

    @OneToMany
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "Student_id")
    private List<Course1> course;

    public Student(String name, String college, String address) {
        this.name = name;
        this.college = college;
        this.address = address;
    }

    public List<Course1> getCourse() {
        return course;
    }

    public void setCourse(List<Course1> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", address='" + address + '\'' +
                ", course=" + course +
                '}';
    }
}
