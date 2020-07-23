package com.example.urenapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //this is the auto increment
	long idMessage; //primary key
	String message;
	
	public long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(long idMessage) {
		this.idMessage = idMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
