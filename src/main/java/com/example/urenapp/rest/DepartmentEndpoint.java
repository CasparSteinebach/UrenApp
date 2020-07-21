package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.DepartmentService;
import com.example.urenapp.Model.Department;

@RestController
@RequestMapping("/api/urenapp")
public class DepartmentEndpoint {

	@Autowired 
	DepartmentService uas;

	@GetMapping("/loonsverhoging/{id}")
	public double NieuwSalaris(double salaris) {
		return salaris;
	}
		
	@GetMapping("/all") 
	public Iterable<Department> getDepartment() {
		return uas.getAllDepartments();
	}
}	