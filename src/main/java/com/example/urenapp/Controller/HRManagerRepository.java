package com.example.urenapp.Controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.urenapp.Model.HRManager;

@Component
public interface HRManagerRepository extends CrudRepository<HRManager, Long> {

}
