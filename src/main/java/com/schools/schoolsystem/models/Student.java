package com.schools.schoolsystem.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String passcode;
    @OneToMany
    private Set<Subject> subjects;
}
