package com.example.urenapp.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.Consultant;
import com.example.urenapp.Model.Department;

@Component
public interface ConsultantRepository extends CrudRepository<Consultant, Long> {

}
