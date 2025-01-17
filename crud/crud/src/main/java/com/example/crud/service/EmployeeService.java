package com.example.crud.service;

import com.example.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
