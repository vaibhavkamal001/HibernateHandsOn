package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Staff;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @PostMapping("/add")
    public Staff addAddress(@RequestBody Staff classes) {
        return staffRepository.save(classes);
    }

    @DeleteMapping("/{id}")
    public void deleteStaff(@RequestParam Integer id) {
        staffRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }

    @GetMapping("/{id}")
    public Staff getParents(@RequestParam Integer id) {
        return staffRepository.findById(id).orElse(new Staff());
    }
}
