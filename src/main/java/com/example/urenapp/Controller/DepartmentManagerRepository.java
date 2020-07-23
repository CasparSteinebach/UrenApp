package com.example.urenapp.Controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.DepartmentManager;

@Component
public interface DepartmentManagerRepository extends CrudRepository<DepartmentManager, Long> {

}
