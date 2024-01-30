package com.HibernateAndJpa.Practice.Hibernate.and.JPA.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Classes {
    @Id
    @GeneratedValue(generator = "Incremental")
    Integer class_id;
    String class_name;
    @OneToMany(targetEntity = Students.class, cascade = CascadeType.ALL)
    List<Subjects> subjects;
    @OneToMany(targetEntity = Staff.class, cascade = CascadeType.ALL)
    List<Staff> teachers;
}
