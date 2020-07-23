package com.example.urenapp.Controller;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.CrudRepository;
import com.example.urenapp.Model.HRManager;

@Component
public interface HRManagerRepository extends CrudRepository<HRManager, Long> {

	
}
