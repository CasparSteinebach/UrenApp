package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.HRManagerServices;
import com.example.urenapp.Model.HRManager;

@RestController
@RequestMapping("/api/urenapp")
public class HRManagerEndpoint {

	@Autowired 
	HRManagerServices es;
		
	@GetMapping("/all-hrmanagers") 
	public Iterable<HRManager> getHRManager() {
		return es.getAllHRManagers();
	}
	
	@PostMapping("/new-hrmanager")
	public HRManager addHRManager(@RequestBody HRManager hrmanager) {
		System.out.println("HRManager added :|");
		return es.addEmployee(hrmanager);
	}
	
	@PutMapping("/update-hrmanager/{id}")
	public HRManager updateDepartment(@PathVariable(value = "id")long id, @RequestBody HRManager hr) {
		return es.updateHRManager(id, hr);
	}
	
}	