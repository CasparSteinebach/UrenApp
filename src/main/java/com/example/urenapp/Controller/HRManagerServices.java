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

	public HRManager addHRManager(HRManager hrmanager) {
		System.out.println("HRManager adding executed");
		return hrm.save(hrmanager);
	}

	public HRManager getHRManagerByID(long id) {
		System.out.println("Hier heb grabbed by id ? ");
		return hrm.findById(id).get();
	}

	public HRManager updateHRManagerNaam(long id, HRManager hrs) {
		System.out.println("hrmanager heeft een update gehad, please reboot");
		HRManager hrmanager = hrm.findById(id).get();
		
		if (hrs.getName()!=null && hrs.getName()!= "") {
			hrmanager.setName(hrs.getName());		
		}
		
		if (hrs.getSalary()!= 0.0) {
			hrmanager.setSalary(hrs.getSalary());		
		}
		
		return hrm.save(hrmanager);
	}

	public void deleteHRManagerById(long id) {
		System.out.println("HRManager is ontslagen");
		hrm.deleteById(id);
	}

}
