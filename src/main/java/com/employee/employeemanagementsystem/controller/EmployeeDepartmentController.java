package com.employee.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeemanagementsystem.dto.Department;
import com.employee.employeemanagementsystem.service.EmployeeDepartmentService;

@RestController
public class EmployeeDepartmentController {

	@Autowired
	private EmployeeDepartmentService service;

	@PostMapping("/saveEmployeeDepartment")
	public List<Object> saveEmployeeDepartment(@RequestBody Department department) {

		return service.saveEmployeeDepartment(department);

	}
	
	

}
