package com.start.start.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tblStudent")

public class Student {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "ID",insertable = false,updatable = false,unique = true,nullable = false)
    private String student_id;

    @Column(name = "Name",nullable = false)
    private String student_name;

    @Column(name = "Surname",nullable = false)
    private String Student_surname;

    @Column(name = "Age",nullable = false)
    private int age;

    public String getStudent_surname() {
        return Student_surname;
    }

    public void setStudent_surname(String student_surname) {
        Student_surname = student_surname;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
