package com.mycompany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mycompany.entity.Department;

@Repository

public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
