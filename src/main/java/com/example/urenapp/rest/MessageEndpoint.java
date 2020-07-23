package com.example.urenapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.urenapp.Controller.MessageServices;
import com.example.urenapp.Model.Message;

@RestController
@RequestMapping("/api/urenapp")
public class MessageEndpoint {
	@Autowired
	MessageServices messageservices;

	@PostMapping("/new-message")
	public Message newMessage(@RequestBody Message message) {
		System.out.println("Message added");
		return messageservices.addMessage(message);
	}
	
	@GetMapping("/message/{idMessage}")
	public Message getMessageById(@PathVariable(value ="idMessage")long id) {
		return messageservices.getMessageById(id);
	}
	
	@DeleteMapping("/message/delete/{id}")
	public String deleteMessageById(@PathVariable(value ="id")long id) {
		messageservices.deleteMessageById(id);
		return "Message is verwijderd booya FBI";
	}

}
