package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.School;

import java.util.List;

public interface SchoolService {
    List<School> getAllSchool();

    School getSchool(Integer Id);

    void deleteSchool(Integer Id);

    School saveSchool(School school);

    List<School> saveAllSchool(List<School> schoolList);
}
