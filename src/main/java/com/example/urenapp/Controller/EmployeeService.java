package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.Employee;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	EmployeeRepository emp;
	@Autowired
	HRManagerRepository hrm;

	public Iterable<Employee> getAllEmployees() {
		System.out.println("All employees returned");
		return emp.findAll();
	}

	public Employee addEmployee(Employee employee) {
		System.out.println("Add department executed");
		return emp.save(employee);
	}

	
}
