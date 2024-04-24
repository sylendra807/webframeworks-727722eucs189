package com.question_11_2.question_11_2.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="info_id")
    StudentInfo std;
    
    public Student(int id, String name, StudentInfo std) {
        this.id = id;
        this.name = name;
        this.std = std;
    }

    public Student() {
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

    public StudentInfo getStd() {
        return std;
    }

    public void setStd(StudentInfo std) {
        this.std = std;
    }
    
}
