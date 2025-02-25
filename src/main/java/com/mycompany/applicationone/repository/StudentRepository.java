package com.mycompany.applicationone.repository;

import org.springframework.data.repository.CrudRepository;

import com.mycompany.applicationone.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
