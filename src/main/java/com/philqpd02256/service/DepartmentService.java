/**
 * 
 */
package com.philqpd02256.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philqpd02256.entity.Department;
import com.philqpd02256.repositories.DepartmentRepositories;

@Service
public class DepartmentService {
		
	@Autowired
	private DepartmentRepositories departmentRepositories;
	
	public List<Department> getAll() { 
		List<Department> allDepartment = new ArrayList<>();
		for(Department items : departmentRepositories.findAll()) {
			allDepartment.add(items);
		}
		return allDepartment;
	}
	
	public Department insert(Department department) {
		return departmentRepositories.save(department);
	}
	
	public Department get(String idDepartment) {
		return departmentRepositories.findById(idDepartment).get();
	}
	
}
