package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Students;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/add")
    public Students addAddress(@RequestBody Students classes) {
        return studentRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteStudents(@RequestParam Integer id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Students getParents(@RequestParam Integer id) {
        return studentRepository.findById(id).orElse(new Students());
    }
}
