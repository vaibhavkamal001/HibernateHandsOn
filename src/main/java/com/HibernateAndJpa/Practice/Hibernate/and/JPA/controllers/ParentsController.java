package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Parents;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/parents")
public class ParentsController {

    @Autowired
    ParentRepository parentRepository;

    @PostMapping("/add")
    public Parents addAddress(@RequestBody Parents classes) {
        return parentRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteParents(@RequestParam Integer id) {
        parentRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Parents> getAllParents() {
        return parentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Parents getParents(@RequestParam Integer id) {
        return parentRepository.findById(id).orElse(new Parents());
    }
}
