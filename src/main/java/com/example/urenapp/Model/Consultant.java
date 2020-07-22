package com.example.urenapp.Model;
import javax.persistence.Entity;



@Entity
public class Consultant  extends Employee{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) //this is the auto increment
	long id; //primary key
	String name;
	double salary;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
