package com.mycompany.applicationone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.applicationone.entity.Department;

@Repository

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
