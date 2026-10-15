package com.placeforge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String email;
    private Integer rollNumber;
    private Double cgpa;
    private Integer graduationYear;
    private String branch;

    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }



    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Student(String name, Integer Id, String email, int rollNumber, Double cgpa, Integer graduationYear, String branch) {
        this.name = name;
        this.Id = Id;
        this.email = email;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;
        this.graduationYear = graduationYear;
        this.branch = branch;
    }
}
