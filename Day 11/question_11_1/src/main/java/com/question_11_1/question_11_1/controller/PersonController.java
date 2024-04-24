package com.question_11_1.question_11_1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.question_11_1.question_11_1.model.Person;
import com.question_11_1.question_11_1.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService ps;

    @PostMapping("/person")
    public Person getPerson(@RequestBody Person p)
    {
        return ps.postPersons(p);
    }
    @PostMapping("/address/person/{personId}")
    public Person getPerson(@PathVariable("personId") long pid,@RequestBody Person p)
    {
        return ps.postPersonsById(pid,p);
    }
    @GetMapping("/person/{personId}")
    public Optional<Person> getPersonById(@PathVariable("personId") long pid)
    {
        return ps.getPersonsById(pid);
    }

    @GetMapping("/person")
    public List<Person> getAllPersons()
    {
        return ps.postAllPersons();
    }


}
