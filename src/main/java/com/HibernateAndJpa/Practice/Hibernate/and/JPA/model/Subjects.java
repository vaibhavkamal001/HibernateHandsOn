package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subjects {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer subject_id;
    String subject_name;
}
