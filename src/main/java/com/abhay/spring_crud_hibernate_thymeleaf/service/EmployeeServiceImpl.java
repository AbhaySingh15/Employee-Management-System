package com.abhay.spring_crud_hibernate_thymeleaf.service;

import com.abhay.spring_crud_hibernate_thymeleaf.model.Employee;
import com.abhay.spring_crud_hibernate_thymeleaf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }


    @Override
    public Employee getEmpById(long id) {
        Employee employee = employeeRepository.getReferenceById(id);
        return employee;
    }
}
