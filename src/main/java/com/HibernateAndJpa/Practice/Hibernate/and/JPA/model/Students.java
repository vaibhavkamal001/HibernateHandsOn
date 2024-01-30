package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Students {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer id;
    String first_name;
    String last_name;
    String gender;
    Integer age;
    String dob;
    @OneToOne(targetEntity = Parents.class, cascade = CascadeType.ALL)
    Parents parents;
}
