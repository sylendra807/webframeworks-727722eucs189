package com.question_11_2.question_11_2.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;



@Entity
public class StudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
    public StudentInfo(int id, String address, String phNo) {
        this.id = id;
        this.address = address;
        this.phNo = phNo;
    }
    public StudentInfo() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhNo() {
        return phNo;
    }
    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }
    
}
