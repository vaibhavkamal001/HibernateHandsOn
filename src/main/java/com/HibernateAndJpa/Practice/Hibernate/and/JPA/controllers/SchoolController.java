package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.School;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/school")
public class SchoolController {

    @Autowired
    SchoolRepository schoolRepository;

    @PostMapping("/add")
    public School addAddress(@RequestBody School classes) {
        return schoolRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteSchool(@RequestParam Integer id) {
        schoolRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    @GetMapping("/{id}")
    public School getSchool(@RequestParam Integer id) {
        return schoolRepository.findById(id).orElse(new School());
    }
}
