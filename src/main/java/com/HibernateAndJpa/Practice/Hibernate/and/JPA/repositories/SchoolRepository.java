package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findAll();

    Optional<School> findById(Integer Id);

    School save(School school);

    void deleteById(Integer id);
}
