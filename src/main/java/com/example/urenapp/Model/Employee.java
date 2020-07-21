package com.example.urenapp.Model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //this is the auto increment
	long id; //primary key
	String name;
	double salary;
	ArrayList <Messages> messages;
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
	public ArrayList<Messages> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Messages> messages) {
		this.messages = messages;
	}
	
	
}
