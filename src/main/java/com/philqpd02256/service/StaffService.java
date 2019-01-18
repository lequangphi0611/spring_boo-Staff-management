package com.philqpd02256.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philqpd02256.entity.Department;
import com.philqpd02256.entity.Staff;
import com.philqpd02256.repositories.StaffRepositories;

@Service
public class StaffService {

	@Autowired
	private StaffRepositories staffRepositories;	
	
	public List<Staff> getAllBy(Department department) {
		return staffRepositories.findAllByDepartment(department);
	}
}
