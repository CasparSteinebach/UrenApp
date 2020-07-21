package com.example.urenapp.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.Employee;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
