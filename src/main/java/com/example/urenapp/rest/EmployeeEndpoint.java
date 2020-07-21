package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.EmployeeService;
import com.example.urenapp.Model.Employee;

@RestController
@RequestMapping("/api/urenapp")
public class EmployeeEndpoint {

	@Autowired 
	EmployeeService es;
		
	@GetMapping("/all-employees") 
	public Iterable<Employee> getEmployee() {
		return es.getAllEmployees();
	}
	
	@PostMapping("/new-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("Employee added :)");
		return es.addEmployee(employee);
	}
}	