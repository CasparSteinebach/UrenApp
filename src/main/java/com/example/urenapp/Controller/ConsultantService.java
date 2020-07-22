package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.Consultant;

@Service
@Transactional
public class ConsultantService {
	@Autowired
	ConsultantRepository conrepo;

	public Consultant addConsultant(Consultant consultant) {
		System.out.println("Consultant gecontracteerd");
		return conrepo.save(consultant);
	}

	public Iterable<Consultant> getAllConsultants() {
		System.out.println("All Consultants returned");
		return conrepo.findAll();
	}

	public Consultant getConsultantByID(long id) {
		System.out.println("Consultant gepakt bij z'n id");
		return conrepo.findById(id).get();
	}

	public Consultant updateConsultantNaam(long id, Consultant cons) {
		System.out.println("Consultant heeft een update gehad, please reboot");
		Consultant consultant = conrepo.findById(id).get();
		
		if (cons.getName() != null && cons.getName()!= "") {
			consultant.setName(cons.getName());
		}
		if (cons.getSalary() != 0.0) {
			consultant.setSalary(cons.getSalary());
		}
		return conrepo.save(consultant);
	}

	public void deleteConsultantById(long id) {
		System.out.println("Consultant is ontslagen");
		conrepo.deleteById(id);	
	}
	
}
