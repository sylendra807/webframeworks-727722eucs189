package com.question_11_2.question_11_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.question_11_2.question_11_2.model.StudentInfo;


@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}