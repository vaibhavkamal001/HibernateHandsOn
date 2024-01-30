package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Subjects;

import java.util.List;

public interface SubjectService {
    List<Subjects> getAllSubjects();

    Subjects getSubjects(Integer Id);

    void deleteSubjects(Integer Id);

    Subjects saveSubjects(Subjects subjects);

    List<Subjects> saveAllSubjects(List<Subjects> subjects);
}
