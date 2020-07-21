package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.HRManager;

@Service
@Transactional
public class HRManagerServices {
	@Autowired
	HRManagerRepository hrm;
	
	public Iterable<HRManager> getAllHRManagers() {
		System.out.println("All HRManagers returned");
		return hrm.findAll();
	}

	public HRManager addEmployee(HRManager hrmanager) {
		System.out.println("HRManager executed");
		return hrm.save(hrmanager);
	}

	public HRManager updateHRManager(long id, HRManager hr) {
		System.out.println("HRManager is ontslagen en vervangen");
		hr.setId(id);
		return hrm.save(hr);
	}


}
