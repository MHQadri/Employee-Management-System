package com.employee.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeemanagementsystem.dao.EmployeeDepartmentDao;
import com.employee.employeemanagementsystem.dto.Department;

@Service
public class EmployeeDepartmentService {

	@Autowired
	private EmployeeDepartmentDao dao;

	public List<Object> saveEmployeeDepartment(Department department) {
		return dao.saveEmployeeDepartment(department);
	}

}
