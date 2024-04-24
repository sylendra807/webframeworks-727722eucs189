package com.question_11_1.question_11_1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question_11_1.question_11_1.model.Person;
import com.question_11_1.question_11_1.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository prepo;

    //person POST
    public Person postPersons(Person p)
    {
        return prepo.save(p);
    }

    //person GET
    public List<Person> postAllPersons()
    {
        return prepo.findAll();
    }

    //address/person/{personId} - POST
    public Person postPersonsById(long pid,Person p)
    {
        return prepo.save(p);
    }

    //person/{personId} GET
    public Optional<Person> getPersonsById(long pid)
    {
        return prepo.findById(pid);
    }
}
