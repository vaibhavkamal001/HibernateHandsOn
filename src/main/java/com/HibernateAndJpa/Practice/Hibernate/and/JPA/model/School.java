package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class School {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer school_id;
    String school_name;
    String education_board;
    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    Address address;
}
