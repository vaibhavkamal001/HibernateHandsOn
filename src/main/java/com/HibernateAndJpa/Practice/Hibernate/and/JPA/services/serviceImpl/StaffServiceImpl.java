package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Staff;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.StaffRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.StaffService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    @Autowired
    StaffServiceImpl(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<Staff> getAllStaff() {
        List<Staff> staffList = staffRepository.findAll();
        return staffList;
    }

    @Override
    public Staff getStaff(Integer Id) {
        Optional<Staff> staff = staffRepository.findById(Id);
        return staff.orElse(null);
    }

    @Override
    public void deleteStaff(Integer Id) {
        staffRepository.deleteById(Id);
    }

    @Override
    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> saveAllStaff(List<Staff> staffList) {
        return staffRepository.saveAll(staffList);
    }
}
