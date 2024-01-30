package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer address_id;
    String street;
    String city;
    String state;
    String country;


    public Address bindAddress(Address addressObj) {
        Address address = new Address();
        address.setCity(addressObj.getCity());
        address.setCountry(addressObj.getCountry());
        address.setStreet(addressObj.getStreet());
        address.setState(addressObj.getState());
        return address;
    }
}
