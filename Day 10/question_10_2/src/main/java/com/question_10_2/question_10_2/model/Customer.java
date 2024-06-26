package com.question_10_2.question_10_2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    int customerId;
    String customerName,city,address;
    int pincode;
    public Customer(int customerId, String customerName, String city, String address, int pincode) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }
    public Customer() {
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
}
