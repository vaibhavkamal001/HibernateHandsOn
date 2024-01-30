package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Classes;

import java.util.List;

public interface ClassesService {
    List<Classes> getAllClasses();

    Classes getClasses(Integer Id);

    void deleteClasses(Integer Id);

    Classes saveClasses(Classes classes);

    List<Classes> saveAllClasses(List<Classes> classesList);
}
