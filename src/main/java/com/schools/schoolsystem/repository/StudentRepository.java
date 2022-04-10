package com.schools.schoolsystem.repository;

import com.schools.schoolsystem.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
