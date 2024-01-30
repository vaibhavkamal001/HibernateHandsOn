package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.serviceImpl;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Address;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.AddressRepository;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.services.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ParentServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    ParentServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddress() {
        List<Address> addressList = addressRepository.findAll();
        return addressList;
    }

    @Override
    public Address getAddress(Integer Id) {
        Optional<Address> address = addressRepository.findById(Id);
        return address.orElse(null);
    }

    @Override
    public void deleteAddress(Integer Id) {
        addressRepository.deleteById(Id);
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> saveAllAddress(List<Address> addressList) {
        return addressRepository.saveAll(addressList);
    }

}
