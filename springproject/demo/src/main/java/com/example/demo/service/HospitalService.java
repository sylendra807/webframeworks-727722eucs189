package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HospitalDetails;
import com.example.demo.repository.HospitalRepo;


@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hRepo;

    //posting
    public HospitalDetails saveDetails(HospitalDetails h)
    {
        return hRepo.save(h);
    }

    public HospitalDetails updateDetails(int id,HospitalDetails h)
    {
        return hRepo.save(h);
    }

    //getting 1
    public List<HospitalDetails> getAllDetails()
    {
        return hRepo.findAll();
    }

    //getting 2
    public Optional<HospitalDetails> getSpecificDetail(int id)
    {
        return hRepo.findById(id);
    }

    //delete
    public void deleteSpecificDetails(int id)
    {
        hRepo.deleteById(id);
    }
}
