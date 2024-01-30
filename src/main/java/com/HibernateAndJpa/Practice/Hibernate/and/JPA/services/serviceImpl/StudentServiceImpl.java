package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Students;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.StudentRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> getAllStudents() {
        List<Students> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public Students getStudents(Integer Id) {
        Optional<Students> address = studentRepository.findById(Id);
        return address.orElse(null);
    }

    @Override
    public void deleteStudents(Integer Id) {
        studentRepository.deleteById(Id);
    }

    @Override
    public Students saveStudents(Students address) {
        return studentRepository.save(address);
    }

    @Override
    public List<Students> saveAllStudents(List<Students> studentList) {
        return studentRepository.saveAll(studentList);
    }
}
