package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Salaries;

import java.util.List;

public interface SalariesService {
    List<Salaries> getAllSalaries();

    Salaries getSalaries(Integer Id);

    void deleteSalaries(Integer Id);

    Salaries saveSalaries(Salaries salaries);

    List<Salaries> saveAllSalaries(List<Salaries> salariesList);
}
