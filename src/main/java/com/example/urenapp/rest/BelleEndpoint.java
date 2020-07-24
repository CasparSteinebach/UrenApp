package com.example.urenapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Model.Employee;

@RestController
@RequestMapping("/api/urenapp")
public class BelleEndpoint {

	@GetMapping("/belle")
	public String go() {
		System.out.println("hij doet het");
		return "The back end speaks";
	}
	@PostMapping("/post")
	public void go2(@RequestBody Employee employee) {
		System.out.println("post doet het "+employee.getName());
		
	}
}
