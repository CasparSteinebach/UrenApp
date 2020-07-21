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
}
