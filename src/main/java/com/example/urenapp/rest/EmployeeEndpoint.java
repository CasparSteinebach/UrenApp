package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.ConsultantService;
import com.example.urenapp.Controller.EmployeeService;
import com.example.urenapp.Controller.HRManagerServices;
import com.example.urenapp.Model.Consultant;
import com.example.urenapp.Model.Employee;
import com.example.urenapp.Model.HRManager;

@RestController
@RequestMapping("/api/urenapp")
public class EmployeeEndpoint {

	@Autowired 
	EmployeeService es;
	@Autowired
	HRManagerServices hrs;
	@Autowired
	ConsultantService cons;
	
	// Lijsten maken
	
	@GetMapping("/all-employees") 
	public Iterable<Employee> getEmployee() {
		return es.getAllEmployees();
	}
	
	@GetMapping("/all-hrmanagers")
	public Iterable<HRManager> getHRManagers() {
		return hrs.getAllHRManagers();
	}
	
	@GetMapping("/all-consultants")
	public Iterable<Consultant> getConsultants(){
		return cons.getAllConsultants();
	}
	
	// Nieuwe medewerkers toevoegen
	
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
	
	@PostMapping("/new-consultant")
	public Consultant addConsultant(@RequestBody Consultant consultant) {
		System.out.println("Consultant aangenomen");
		return cons.addConsultant(consultant);
	}
	
	// medewerkers vinden op basis van id
	
	@GetMapping("/hrmanager/{id}")
	public HRManager getHRManagerById(@PathVariable(value="id") long id) {
		return hrs.getHRManagerByID(id);
	}
	
	@GetMapping("/consultant/{id}")
	public Consultant getConsultantById(@PathVariable(value="id") long id) {
		return cons.getConsultantByID(id);
	}
	
	// medewerkers updaten
	
	@PutMapping("/update/hrmanager/{id}")
	public HRManager updateHRManager(@PathVariable(value="id") long id, @RequestBody HRManager hrm) {
		return hrs.updateHRManagerNaam(id, hrm);
	}
	
	@PutMapping("/update/consultant/{id}")
	public Consultant updateConsultant(@PathVariable(value="id") long id, @RequestBody Consultant consul) {
		return cons.updateConsultantNaam(id, consul);
	}
	
	// medewerkers verwijderen
	
	@DeleteMapping("/delete/hrmanager/{id}")
	public String deleteHRManagerById(@PathVariable(value="id") long id) {
		hrs.deleteHRManagerById(id);
		return "ONTSLAGEN!!!!";
	}
	
	@DeleteMapping("delete/consultant/{id}")
	public String deleteConsultantById(@PathVariable(value="id") long id) {
		cons.deleteConsultantById(id);
		return "CONSULTANT IS ONTSLAGEN!!!";
	}
	
}