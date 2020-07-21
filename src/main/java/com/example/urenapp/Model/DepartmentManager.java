package com.example.urenapp.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentManager extends Employee implements MeetingLeader{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //this is the auto increment
	long id; //primary key

	
	public void startMeeting() {
		System.out.println("meeting has started");
	}
}
