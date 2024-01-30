package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Subjects;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SubjectRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.SubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Autowired
    SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subjects> getAllSubjects() {
        List<Subjects> subjectList = subjectRepository.findAll();
        return subjectList;
    }

    @Override
    public Subjects getSubjects(Integer Id) {
        Optional<Subjects> subject = subjectRepository.findById(Id);
        return subject.orElse(null);
    }

    @Override
    public void deleteSubjects(Integer Id) {
        subjectRepository.deleteById(Id);
    }

    @Override
    public Subjects saveSubjects(Subjects subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public List<Subjects> saveAllSubjects(List<Subjects> subjectList) {
        return subjectRepository.saveAll(subjectList);
    }
}
