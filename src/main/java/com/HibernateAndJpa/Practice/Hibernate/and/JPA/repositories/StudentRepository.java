package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Students, Integer> {

    List<Students> findAll();

    Optional<Students> findById(Integer Id);

    Students save(Students parents);

    void deleteById(Integer id);
}
