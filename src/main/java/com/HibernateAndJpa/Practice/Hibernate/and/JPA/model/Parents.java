package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Parents {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer id;
    String first_name;
    String last_name;
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    List<Address> addresses;
}
