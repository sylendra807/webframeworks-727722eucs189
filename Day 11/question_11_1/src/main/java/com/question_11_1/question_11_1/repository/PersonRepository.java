package com.question_11_1.question_11_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question_11_1.question_11_1.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
