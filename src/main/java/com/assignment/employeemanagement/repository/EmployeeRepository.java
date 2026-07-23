package com.assignment.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.employeemanagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
