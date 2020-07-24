package com.example.urenapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Model.Employee;

@RestController
public class MauriceEndPoint {
	@GetMapping("/jojo/new")
	public String go() {
		System.out.println("hij doet het");
		return "dit komt uit de backend";
	}
	
	@GetMapping("/jojo/oud")
	public String oud() {
		System.out.println("Deze doet het ook");
		return "wat moet je met oude koeien?";
	}
	@PostMapping("/jojo/post")
	public void go3(@RequestBody Employee employee) {
		System.out.println("Welke artiest? Post " + employee.getName());
		
	}
}
