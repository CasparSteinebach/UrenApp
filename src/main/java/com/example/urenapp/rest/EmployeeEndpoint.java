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
import com.example.urenapp.Controller.DepartmentManagerService;
import com.example.urenapp.Controller.EmployeeService;
import com.example.urenapp.Controller.HRManagerServices;
import com.example.urenapp.Controller.ProgrammerService;
import com.example.urenapp.Model.Consultant;
import com.example.urenapp.Model.DepartmentManager;
import com.example.urenapp.Model.Employee;
import com.example.urenapp.Model.HRManager;
import com.example.urenapp.Model.Programmer;

@RestController
@RequestMapping("/api/urenapp")
public class EmployeeEndpoint {

	@Autowired 
	EmployeeService employeeservice;
	@Autowired
	HRManagerServices hrmservice;
	@Autowired
	ConsultantService consultantservice;
	@Autowired
	DepartmentManagerService depmanagerservice;
	@Autowired
	ProgrammerService programmerservice;
	
	// Lijsten maken
	
	@GetMapping("/all-employees") 
	public Iterable<Employee> getEmployee() {
		return employeeservice.getAllEmployees();
	}
	
	@GetMapping("/all-hrmanagers")
	public Iterable<HRManager> getHRManagers() {
		return hrmservice.getAllHRManagers();
	}
	
	@GetMapping("/all-departmentmanagers")
	public Iterable<DepartmentManager> getDepartmentManagers() {
		return depmanagerservice.getAllDepartmentManagers();
	}
	
	@GetMapping("/all-consultants")
	public Iterable<Consultant> getConsultants(){
		return consultantservice.getAllConsultants();
	}
	
	@GetMapping("/all-programmers")
	public Iterable<Programmer> getProgrammers(){
		return programmerservice.getAllProgrammers();
	}
	
	// Nieuwe medewerkers toevoegen
	
	@PostMapping("/new-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("Employee added :)");
		return employeeservice.addEmployee(employee);
	}
	@PostMapping("/new-hrmanager")
	public HRManager addHRManager(@RequestBody HRManager hrmanager) {
		System.out.println("HRManager added :-)");
		return hrmservice.addHRManager(hrmanager);
	}
	
	@PostMapping("/new-departmentmanager")
	public DepartmentManager addDepartmentManager(@RequestBody DepartmentManager depmanager) {
		System.out.println("dep manager added :-|");
		return depmanagerservice.addDepartmentManager(depmanager);
	}
	
	@PostMapping("/new-consultant")
	public Consultant addConsultant(@RequestBody Consultant consultant) {
		System.out.println("Consultant aangenomen");
		return consultantservice.addConsultant(consultant);
	}
	@PostMapping("/new-programmer")
	public Programmer addProgrammer(@RequestBody Programmer programmer) {
		System.out.println("Consultant aangenomen");
		return programmerservice.addProgrammer(programmer);
	}
	
	// medewerkers vinden op basis van id
	
	@GetMapping("/hrmanager/{id}")
	public HRManager getHRManagerById(@PathVariable(value="id") long id) {
		return hrmservice.getHRManagerByID(id);
	}
	
	@GetMapping("/departmentmanager/{id}")
	public DepartmentManager getDepartmentManagerById(@PathVariable(value="id") long id) {
		return depmanagerservice.getDepartmentManagerByID(id);
	}
	
	@GetMapping("/consultant/{id}")
	public Consultant getConsultantById(@PathVariable(value="id") long id) {
		return consultantservice.getConsultantByID(id);
	}
	
	@GetMapping("/programmer/{id}")
	public Programmer getProgrammerById(@PathVariable(value="id") long id) {
		return programmerservice.getProgrammerByID(id);
	}
	
	// medewerkers updaten
	
	@PutMapping("/update/hrmanager/{id}")
	public HRManager updateHRManager(@PathVariable(value="id") long id, @RequestBody HRManager hrm) {
		return hrmservice.updateHRManagerNaam(id, hrm);
	}
	
	@PutMapping("/update/consultant/{id}")
	public Consultant updateConsultant(@PathVariable(value="id") long id, @RequestBody Consultant consul) {
		return consultantservice.updateConsultantNaam(id, consul);
	}
	
	@PutMapping("/update/departmentmanager/{id}")
	public DepartmentManager updateDepartmentManager(@PathVariable(value="id") long id, @RequestBody DepartmentManager depmanager) {
		return depmanagerservice.updateDepartmentManagerName(id, depmanager);
	}
	
	@PutMapping("/update/programmer/{id}")
	public Programmer updateProgrammer(@PathVariable(value="id") long id, @RequestBody Programmer programmer) {
		return programmerservice.updateProgrammerName(id, programmer);
	}
	
	// medewerkers verwijderen
	
	@DeleteMapping("/delete/hrmanager/{id}")
	public String deleteHRManagerById(@PathVariable(value="id") long id) {
		hrmservice.deleteHRManagerById(id);
		return "ONTSLAGEN!!!!";
	}
	
	@DeleteMapping("delete/consultant/{id}")
	public String deleteConsultantById(@PathVariable(value="id") long id) {
		consultantservice.deleteConsultantById(id);
		return "CONSULTANT IS ONTSLAGEN!!!";
	}
	
	@DeleteMapping("delete/departmentmanager/{id}")
	public String deleteDepatmentManagerById(@PathVariable(value="id") long id) {
		depmanagerservice.deleteDepartmentManagerById(id);
		return "CONSULTANT IS ONTSLAGEN!!!";
	}
}