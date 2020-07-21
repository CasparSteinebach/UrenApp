package com.example.urenapp.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.Programmer;

@Component

public interface ProgrammerRepository extends CrudRepository<Programmer, Long> {

}
