package com.question_10_2.question_10_2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.question_10_2.question_10_2.model.Customer;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

    @Modifying
    @Transactional
    @Query("INSERT INTO Customer VALUES (?1,?2,?3,?4,?5)")
    public int insert(int id,String name,String city,String address,int pincode);

    @Modifying
    @Transactional
    @Query("UPDATE Customer SET pincode = ?2 where customerId=?1")
    public int update(int id,int pincode);

    @Query("SELECT c from Customer c")
    public List<Customer> getList();

    @Query("SELECT c from Customer c where city = ?1")
    public List<Customer> getListByCity(String city);

    @Query("SELECT c from Customer c where customerId=?1")
    public Customer getInfoByCustomerId(int id);

    @Modifying
    @Transactional
    @Query("DELETE from Customer where customerId=?1")
    public int deleteCustomers(int id);

}
