package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Staff;

import java.util.List;

public interface StaffService {
    List<Staff> getAllStaff();

    Staff getStaff(Integer Id);

    void deleteStaff(Integer Id);

    Staff saveStaff(Staff staff);

    List<Staff> saveAllStaff(List<Staff> staffList);
}
