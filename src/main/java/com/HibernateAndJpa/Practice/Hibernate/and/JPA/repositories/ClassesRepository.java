package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
    List<Classes> findAll();

    Optional<Classes> findById(Integer Id);

    Classes save(Classes classes);

    void deleteById(Integer id);
}
