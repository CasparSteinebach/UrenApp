package com.example.urenapp.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.Department;

@Component
public interface ProgrammerRepository extends CrudRepository<Department, Long> {

}
