package com.schools.schoolsystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Teacher {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String passcode;
    @OneToOne
    private Subject subject;
}
