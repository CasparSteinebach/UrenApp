package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.Department;
import com.example.urenapp.Model.Employee;

@Service
@Transactional
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrep;
	@Autowired
	EmployeeRepository employeerepository;

	public Iterable<Department> getAllDepartments() {
		System.out.println("All departments returned");
		return departmentrep.findAll();
	}

	public Department addEmployee(long departmentid, long employeeid) {
		Department newDepartment = departmentrep.findById(departmentid).get();
		Employee newEmployee = employeerepository.findById(employeeid).get();
		newDepartment.addEmployees(newEmployee);
		System.out.println("employee was shoved into deparment database");
		return departmentrep.save(newDepartment);
	}

	public Department addEmployee(long departmentid, long employeeid) {
		
		return null;
	}

}
