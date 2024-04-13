package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HospitalDetails;
import com.example.demo.service.HospitalService;
@RestController
public class HospitalController {

    @Autowired
    HospitalService hService;

    @PostMapping(path = "/hospital/post")
    public HospitalDetails postDetails(@RequestBody HospitalDetails h) {
        return hService.saveDetails(h);
    }

    @GetMapping("/hospital/get")
    public List<HospitalDetails> getAllInfo() {
        return hService.getAllDetails();
    }

    @GetMapping("/hospital/get/{patientId}")
    public Optional<HospitalDetails> getThatInfo(@PathVariable int patientId) {
        return hService.getSpecificDetail(patientId);
    }

    @PutMapping("/hospital/update/{patientId}")
    public HospitalDetails updateInfo(@PathVariable("patientId") int pId, @RequestBody HospitalDetails h) {
        return hService.updateDetails(pId, h);
    }

    @DeleteMapping("/hospital/delete/{patientId}")
    public void deleteInfo(@PathVariable("patientId")int id)
    {
        hService.deleteSpecificDetails(id);
    }
}
