package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Salaries;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.SalariesRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.SalariesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class SalariesServiceImpl implements SalariesService {

    private final SalariesRepository salariesRepository;

    @Autowired
    SalariesServiceImpl(SalariesRepository salariesRepository) {
        this.salariesRepository = salariesRepository;
    }

    @Override
    public List<Salaries> getAllSalaries() {
        List<Salaries> salariesList = salariesRepository.findAll();
        return salariesList;
    }

    @Override
    public Salaries getSalaries(Integer Id) {
        Optional<Salaries> salaries = salariesRepository.findById(Id);
        return salaries.orElse(null);
    }

    @Override
    public void deleteSalaries(Integer Id) {
        salariesRepository.deleteById(Id);
    }

    @Override
    public Salaries saveSalaries(Salaries salaries) {
        return salariesRepository.save(salaries);
    }

    @Override
    public List<Salaries> saveAllSalaries(List<Salaries> salariesList) {
        return salariesRepository.saveAll(salariesList);
    }
}
