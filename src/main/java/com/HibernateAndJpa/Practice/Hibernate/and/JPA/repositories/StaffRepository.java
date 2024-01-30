package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    List<Staff> findAll();

    Optional<Staff> findById(Integer Id);

    Staff save(Staff staff);

    void deleteById(Integer id);
}
