package com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subjects, Integer> {
    List<Subjects> findAll();

    Optional<Subjects> findById(Integer Id);

    Subjects save(Subjects subjects);

    void deleteById(Integer id);
}
