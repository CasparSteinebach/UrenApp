package com.example.urenapp.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // this is the auto increment
	private long id; // primary key
	private String naam;
	int aantalMedewerkers;
	double salaris;

	@OneToMany
	@JoinColumn(name = "abcd_id")
	private List<Employee> employees = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getAantalMedewerkers() {
		return aantalMedewerkers;
	}

	public void setAantalMedewerkers(int aantalMedewerkers) {
		this.aantalMedewerkers = aantalMedewerkers;
	}

	public void setSalaris(double salaris) {
		this.salaris = salaris;
	}

	public double getSalaris() {
		return salaris;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void addEmployees(Employee newEmployee) {
		System.out.println("employee was added to database");
		this.employees.add(newEmployee);
	}

}