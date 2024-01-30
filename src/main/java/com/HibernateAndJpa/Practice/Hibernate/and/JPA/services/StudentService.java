package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Students;

import java.util.List;

public interface StudentService {
    List<Students> getAllStudents();

    Students getStudents(Integer Id);

    void deleteStudents(Integer Id);

    Students saveStudents(Students students);

    List<Students> saveAllStudents(List<Students> studentsList);
}
