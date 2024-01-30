package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Parents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ParentRepository extends JpaRepository<Parents, Integer> {

    List<Parents> findAll();

    Optional<Parents> findById(Integer Id);

    Parents save(Parents parents);

    void deleteById(Integer id);
}
