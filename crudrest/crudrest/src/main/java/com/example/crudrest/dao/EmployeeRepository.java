package com.example.crudrest.dao;


import com.example.crudrest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//@RepsitoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
