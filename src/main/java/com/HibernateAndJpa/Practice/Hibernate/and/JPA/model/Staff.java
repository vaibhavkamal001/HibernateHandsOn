package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Staff {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer staff_id;
    String staff_type;
    @OneToOne(targetEntity = School.class, cascade = CascadeType.ALL)
    School school;
    String first_name;
    String last_name;
    Integer age;
    String dob;
    String gender;
}
