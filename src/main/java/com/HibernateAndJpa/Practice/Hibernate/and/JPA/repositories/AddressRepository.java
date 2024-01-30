package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findAll();

    Optional<Address> findById(Integer Id);

    Address save(Address address);

    void deleteById(Integer id);
}
