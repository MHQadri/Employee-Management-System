package com.employee.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employeemanagementsystem.dto.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
