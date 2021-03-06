package com.example.urenapp.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.Message;


@Component
public interface MessageRepository extends CrudRepository<Message, Long> {

}