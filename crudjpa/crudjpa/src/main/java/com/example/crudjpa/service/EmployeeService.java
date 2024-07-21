package com.example.crudjpa.service;


import com.example.crudjpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int Id);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
