package com.employee.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeemanagementsystem.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
