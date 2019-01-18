package com.philqpd02256.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.philqpd02256.entity.Department;
import com.philqpd02256.entity.Staff;

@Repository
public interface StaffRepositories extends CrudRepository<Staff, String> {
	public List<Staff> findAllByDepartment(Department department);
}
