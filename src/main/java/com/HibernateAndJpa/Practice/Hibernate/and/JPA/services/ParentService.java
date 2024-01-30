package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Parents;

import java.util.List;

public interface ParentService {
    List<Parents> getAllParents();

    Parents getParents(Integer Id);

    void deleteParents(Integer Id);

    Parents saveParents(Parents parents);

    List<Parents> saveAllParents(List<Parents> parentsList);
}
