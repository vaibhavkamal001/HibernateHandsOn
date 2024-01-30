package com.HibernateAndJpa.Practice.Hibernate.and.JPA.services;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddress();

    Address getAddress(Integer Id);

    void deleteAddress(Integer Id);

    Address saveAddress(Address address);

    List<Address> saveAllAddress(List<Address> addressList);
}
