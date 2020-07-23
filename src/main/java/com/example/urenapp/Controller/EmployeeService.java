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

	public Employee getEmployeeById(long id) {
		System.out.println("employee retrieved");
		return emp.findById(id).get();
	}

	public void deleteEmployeeById(long id) {
		System.out.println("employee is ontslagen");
		emp.deleteById(id);
	}

	public Employee updateEmployeeName(long id, Employee oldemployee) {
		System.out.println("employee was replaced, reboot please");
		Employee newemployee = emp.findById(id).get();
		if (oldemployee.getName() != null && oldemployee.getName() != "") {
			newemployee.setName(oldemployee.getName());
		}

		if (oldemployee.getSalary() != 0.0) {
			newemployee.setSalary(oldemployee.getSalary());
		}
		return emp.save(newemployee);
	}

}
