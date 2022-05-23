package com.abhay.spring_crud_hibernate_thymeleaf.repository;

import com.abhay.spring_crud_hibernate_thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
