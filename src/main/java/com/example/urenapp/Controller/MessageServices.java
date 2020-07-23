package com.example.urenapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.urenapp.Model.Message;

@Service
@Transactional

public class MessageServices {

	@Autowired
	MessageRepository messagerepository;

	public Message addMessage(Message message) {
		System.out.println("add message executed");
		return messagerepository.save(message);
	}

	public Message getMessageById(long id) {
		System.out.println("Message retrieved");
		return messagerepository.findById(id).get();
	}

	public void deleteMessageById(long id) {
		System.out.println("Message is gone");
		messagerepository.deleteById(id);
		
	}
}
