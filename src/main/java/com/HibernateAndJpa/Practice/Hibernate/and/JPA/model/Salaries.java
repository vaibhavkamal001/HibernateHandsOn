package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Salaries {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer id;

    @OneToOne(targetEntity = Staff.class, cascade = CascadeType.ALL)
    String amount;

    String currency;
}
