package com.question_10_2.question_10_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question_10_2.question_10_2.model.Customer;
import com.question_10_2.question_10_2.repository.CustomerRepo;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo cRepo;

    @PostMapping("/api/Customer")
    public Customer postCustomer(@RequestBody Customer c)
    {
        return cRepo.save(c);
    }

    @PutMapping("/api/Customer/{customerId}/{pincode}")
    public String putCustomer(@RequestBody Customer c,@PathVariable("customerId") int id,@PathVariable("pincode") int pincode)
    {
        return cRepo.update(id,pincode)+" updated Successfully.";
    }

    @GetMapping("/api/customer")
    public List<Customer> getCustomerList()
    {
        return cRepo.getList();
    }

    @GetMapping("/api/customer/{customerId}")
    public Customer getCustomerInfo(@PathVariable("customerId") int id)
    {
        return cRepo.getInfoByCustomerId(id);
    }

    @GetMapping("/api/customer/bycity/{city}")
    public List<Customer> getCustomerByCity(@PathVariable("city") String city)
    {
        return cRepo.getListByCity(city);
    }

    @DeleteMapping("/api/customer/{customerId}")
    public String deleteCustomers(@PathVariable("customerId") int id,@RequestBody Customer c)
    {
        return cRepo.deleteCustomers(id)+" Customer deleted successfully.";
    }
}
