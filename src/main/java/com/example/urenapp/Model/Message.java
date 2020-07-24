package com.example.urenapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "message")
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // this is the auto increment
	private long idMessage; // primary key
	private String message;

	@ManyToMany(mappedBy = "messages")
	@JsonBackReference
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
