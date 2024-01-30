package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Salaries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SalariesRepository extends JpaRepository<Salaries, Integer> {
    List<Salaries> findAll();

    Optional<Salaries> findById(Integer Id);

    Salaries save(Salaries salaries);

    void deleteById(Integer id);
}
