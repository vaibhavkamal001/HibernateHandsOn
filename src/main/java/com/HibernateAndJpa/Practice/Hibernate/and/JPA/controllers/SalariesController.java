package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Salaries;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SalariesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salaries")
public class SalariesController {

    @Autowired
    SalariesRepository salariesRepository;

    @PostMapping("/add")
    public Salaries addAddress(@RequestBody Salaries classes) {
        return salariesRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteSalaries(@RequestParam Integer id) {
        salariesRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Salaries> getAllSalaries() {
        return salariesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Salaries getParents(@RequestParam Integer id) {
        return salariesRepository.findById(id).orElse(new Salaries());
    }
}
