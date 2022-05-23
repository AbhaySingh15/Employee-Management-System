package com.abhay.spring_crud_hibernate_thymeleaf.service;

import com.abhay.spring_crud_hibernate_thymeleaf.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void addEmployee(Employee employee);
    public void deleteEmployee(long id);
    public Employee getEmpById(long id);
}
