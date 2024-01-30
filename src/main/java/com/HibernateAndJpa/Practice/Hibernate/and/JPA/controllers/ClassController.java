package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Classes;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/classes")
public class ClassController {

    @Autowired
    ClassesRepository classesRepository;

    @PostMapping("/add")
    public Classes addAddress(@RequestBody Classes classes) {
        return classesRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteClasses(@RequestParam Integer id) {
        classesRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Classes getClasses(@RequestParam Integer id) {
        return classesRepository.findById(id).orElse(new Classes());
    }
}
