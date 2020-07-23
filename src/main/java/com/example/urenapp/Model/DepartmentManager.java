package com.example.urenapp.Model;

import javax.persistence.Entity;

@Entity
public class DepartmentManager extends Employee implements MeetingLeader {
	long id;
	String name;
	double salary;

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

	public void startMeeting() {
		System.out.println("meeting has started");
	}
}
