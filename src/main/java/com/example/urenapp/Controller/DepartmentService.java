package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.Department;

@Service
@Transactional

public class DepartmentService {

	@Autowired
	DepartmentRepository dr;

	public Iterable<Department> getAllDepartments() {
		System.out.println("All departments returned");
		return dr.findAll();
	}

	public Department addEmployee(long departmentid, long employeeid) {
		
		return null;
	}

}
