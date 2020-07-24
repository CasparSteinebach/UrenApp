package com.example.urenapp.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // this is the auto increment
	private long id; // primary key
	private String name;
	private double salary;
	@OneToMany
	@JoinColumn(name = "employee_id")
	private List<Message> messages;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
//	public ArrayList<Message> getMessages() {
//		return messages;
//	}
//	public void setMessages(ArrayList<Message> messages) {
//		this.messages = messages;
//	}

}
