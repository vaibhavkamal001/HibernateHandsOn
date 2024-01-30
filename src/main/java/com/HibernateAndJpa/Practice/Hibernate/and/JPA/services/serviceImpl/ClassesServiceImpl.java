package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Classes;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.ClassesRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.ClassesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ClassesServiceImpl implements ClassesService {

    private final ClassesRepository classesRepository;

    @Autowired
    ClassesServiceImpl(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }

    @Override
    public List<Classes> getAllClasses() {
        List<Classes> addressList = classesRepository.findAll();
        return addressList;
    }

    @Override
    public Classes getClasses(Integer Id) {
        Optional<Classes> address = classesRepository.findById(Id);
        return address.orElse(null);
    }

    @Override
    public void deleteClasses(Integer Id) {
        classesRepository.deleteById(Id);
    }

    @Override
    public Classes saveClasses(Classes address) {
        return classesRepository.save(address);
    }

    @Override
    public List<Classes> saveAllClasses(List<Classes> addressList) {
        return classesRepository.saveAll(addressList);
    }
}
