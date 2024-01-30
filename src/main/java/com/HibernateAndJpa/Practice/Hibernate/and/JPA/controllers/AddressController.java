package com.HibernateAndJpa.Practice.Hibernate.and.JPA.controllers;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Address;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @PostMapping("/add")
    public Address addAddress(@RequestBody Address address) {
        Address address1 = address.bindAddress(address);
        return addressRepository.save(address1);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Integer id) {
        addressRepository.deleteById(id);
    }

    @GetMapping("/all")
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable Integer id) {
        return addressRepository.findById(id).orElse(new Address());
    }
}
