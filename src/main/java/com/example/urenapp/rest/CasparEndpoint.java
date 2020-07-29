package com.example.urenapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Model.Employee;

@RestController
public class CasparEndpoint {
	@GetMapping("/caspar")
	public String go() {
		System.out.println("Hij doet het! joepie");
		return "hallooo";
	}
	
	@GetMapping("/productterug") 
		public String productTerug() {
		
			Employee caspar = new Employee();
			caspar.setName("Caspar Steinebach");
			return caspar.getName();
		}
	
	@PostMapping("/invulvelden")
	public Employee invullenEmployee(@RequestBody Employee employee) {
		System.out.println("Consultant aangenomen");
		return null;
	}
		
	}


