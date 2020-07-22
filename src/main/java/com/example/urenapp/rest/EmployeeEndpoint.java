package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.EmployeeService;
import com.example.urenapp.Controller.HRManagerServices;
import com.example.urenapp.Model.Employee;
import com.example.urenapp.Model.HRManager;

@RestController
@RequestMapping("/api/urenapp")
public class EmployeeEndpoint {

	@Autowired 
	EmployeeService es;
	@Autowired
	HRManagerServices hrs;
	
	@GetMapping("/all-employees") 
	public Iterable<Employee> getEmployee() {
		return es.getAllEmployees();
	}
	
	@PostMapping("/new-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("Employee added :)");
		return es.addEmployee(employee);
	}
	@PostMapping("/new-hrmanager")
	public HRManager addHRManager(@RequestBody HRManager hrmanager) {
		System.out.println("HRManager added :-)");
		return hrs.addHRManager(hrmanager);
	}
	
	@GetMapping("/all-hrmanagers")
	public Iterable<HRManager> getHRManagers() {
		return hrs.getAllHRManagers();
	}
	
	@GetMapping("/hrmanager/{id}")
	public HRManager getHRManagerById(@PathVariable(value="id") long id) {
		return hrs.getHRManagerByID(id);
	}
	
	@PutMapping("/update/hrmanager/{id}")
	public HRManager updateHRManager(@PathVariable(value="id") long id, @RequestBody HRManager hrm) {
		return hrs.updateHRManagerNaam(id, hrm);
	}
	
}