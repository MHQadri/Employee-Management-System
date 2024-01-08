package com.employee.employeemanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.employeemanagementsystem.dto.Department;
import com.employee.employeemanagementsystem.dto.Employee;
import com.employee.employeemanagementsystem.repository.DepartmentRepository;
import com.employee.employeemanagementsystem.repository.EmployeeRepository;

@Repository
public class EmployeeDepartmentDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Object> saveEmployeeDepartment(Department department) {

		List<Employee> departments = department.getEmployees();
		List<Object> obj = new ArrayList<>();
		for (Employee employee : departments) {

			employee.setDepartment(department);
			obj.add(department);
			employeeRepository.save(employee);
		}
		return obj;

	}

}
