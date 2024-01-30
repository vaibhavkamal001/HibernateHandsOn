package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.School;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SchoolRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.SchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> getAllSchool() {
        List<School> schoolList = schoolRepository.findAll();
        return schoolList;
    }

    @Override
    public School getSchool(Integer Id) {
        Optional<School> school = schoolRepository.findById(Id);
        return school.orElse(null);
    }

    @Override
    public void deleteSchool(Integer Id) {
        schoolRepository.deleteById(Id);
    }

    @Override
    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> saveAllSchool(List<School> schoolList) {
        return schoolRepository.saveAll(schoolList);
    }
}
