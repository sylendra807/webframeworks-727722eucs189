package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HospitalDetails;


@Repository
public interface HospitalRepo extends JpaRepository<HospitalDetails,Integer> {

}
