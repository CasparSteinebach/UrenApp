package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.Programmer;

@Service
@Transactional
public class ProgrammerService {
	@Autowired
	ProgrammerRepository programmerrepository;

	public Programmer addProgrammer(Programmer programmer) {
		System.out.println("new programmer - welcome nerd");
		return programmerrepository.save(programmer);
	}

	public Iterable<Programmer> getAllProgrammers() {
		System.out.println("all programmers returned");
		return programmerrepository.findAll();
	}

	public Programmer getProgrammerByID(long id) {
		System.out.println("gently getting programmer by id (not grabbing)");
		return programmerrepository.findById(id).get();
	}

	public Programmer updateProgrammerName(long id, Programmer programmer) {
		System.out.println("programmer was updated please try turning on and back off again");
		Programmer newprogrammer = programmerrepository.findById(id).get();
		if (programmer.getName() != null && programmer.getName() != "") {
			newprogrammer.setName(programmer.getName());
		}
		if (programmer.getSalary() != 0.0) {
			newprogrammer.setSalary(programmer.getSalary());
		}
		return programmerrepository.save(newprogrammer);
	}
}
