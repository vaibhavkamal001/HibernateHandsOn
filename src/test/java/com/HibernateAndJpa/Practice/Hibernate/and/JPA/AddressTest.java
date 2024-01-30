package com.HibernateAndJpa.Practice.Hibernate.and.JPA;

import com.HibernateAndJpa.Practice.Hibernate.and.JPA.model.Address;
import com.HibernateAndJpa.Practice.Hibernate.and.JPA.repositories.AddressRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class AddressTest {

    private AddressRepository addressRepository;

    @Autowired
    public void setAddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Test
    public void createDummyAddress(){

        Address address = new Address();
        address.setCity("New Dehli");
        address.setCountry("India");
        address.setStreet("Near india gate");
        address.setState("Uttar Pradesh");

        System.out.println(addressRepository.save(address));
    }

    @Test
    public void getAddress(){

        Address address = new Address();
        address.setCity("New Dehli");
        address.setCountry("India");
        address.setStreet("Near india gate");
        address.setState("Uttar Pradesh");

        getAllAddress();

        System.out.println(addressRepository.save(address));
    }

    @Test
    public void getAllAddress(){
        System.out.println("New Transaction");
        addressRepository.findAll().stream().forEach(e->System.out.println(e.getAddress_id()));
    }

    @Test
    @Transactional
    public void deleteAddress(){

        Address address = new Address();
        address.setCity("New Dehli");
        address.setCountry("India");
        address.setStreet("Near india gate");
        address.setState("Uttar Pradesh");

        System.out.println(addressRepository.save(address));
    }
}
