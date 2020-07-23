package com.example.urenapp.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urenapp.Model.DepartmentManager;
import com.example.urenapp.Model.Programmer;

@Service
@Transactional
public class DepartmentManagerService {
	@Autowired
	DepartmentManagerRepository depmanagerrepository;

	public Iterable<DepartmentManager> getAllDepartmentManagers() {
		System.out.println("All departmnet managers returned");
		return depmanagerrepository.findAll();
	}

	public DepartmentManager addDepartmentManager(DepartmentManager depmanager) {
		System.out.println("dep manager added");
		return depmanagerrepository.save(depmanager);
	}

	public DepartmentManager getDepartmentManagerByID(long id) {
		System.out.println("grabbed dep manager by id gross");
		return depmanagerrepository.findById(id).get();
	}

	public void deleteDepartmentManagerById(long id) {
		System.out.println("department manager ontslagen - booooo");
		depmanagerrepository.deleteById(id);
	}

	public DepartmentManager updateDepartmentManagerName(long id, DepartmentManager departmentmanager) {
		System.out.println("dep manager was updated, reboot");
		DepartmentManager newdepartmentmanager = depmanagerrepository.findById(id).get();
		if (departmentmanager.getName() != null && departmentmanager.getName() != "") {
			newdepartmentmanager.setName(departmentmanager.getName());
		}

		if (departmentmanager.getSalary() != 0.0) {
			newdepartmentmanager.setSalary(departmentmanager.getSalary());
		}
		return depmanagerrepository.save(newdepartmentmanager);
	}

}