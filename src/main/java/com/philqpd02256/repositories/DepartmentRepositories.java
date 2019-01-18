package com.philqpd02256.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.philqpd02256.entity.Department;

@Repository
public interface DepartmentRepositories extends CrudRepository<Department, String>{

	public List<Department> findByDepartmentName(String departmentName);
	
}
