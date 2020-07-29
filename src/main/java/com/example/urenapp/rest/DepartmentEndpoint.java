package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.DepartmentService;
import com.example.urenapp.Model.Department;
import com.example.urenapp.Model.HRManager;

@RestController
@RequestMapping("/api/urenapp")
public class DepartmentEndpoint {

	@Autowired
	DepartmentService uas;

	// @Autowired
	HRManager hrmanagerdepartment;

	@GetMapping("/loonsverhoging/{id}")
	public double NieuwSalaris(double salaris) {
		return salaris;
	}

	@GetMapping("/all")
	public Iterable<Department> getDepartment() {
		return uas.getAllDepartments();
	}

	@GetMapping("/startmeeting")
	public void StartMeeting() {
		hrmanagerdepartment.startMeeting();
		System.out.println("Conference Room gereserveerd");
	}
	
	@PutMapping("/addemployee/{departmentid}/{employeeid}")
	public Department addEmployeeToDepartment(@PathVariable(value = "departmentid") long departmentid, @PathVariable(value = "employeeid") long employeeid) {
		return uas.addEmployee(departmentid, employeeid);
	}


}