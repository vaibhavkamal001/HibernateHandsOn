package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Subjects;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/subject")
public class SubjectsController {

    @Autowired
    SubjectRepository subjectRepository;

    @PostMapping("/add")
    public Subjects addAddress(@RequestBody Subjects classes) {
        return subjectRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteSubjects(@RequestParam Integer id) {
        subjectRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Subjects> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Subjects getParents(@RequestParam Integer id) {
        return subjectRepository.findById(id).orElse(new Subjects());
    }
}
