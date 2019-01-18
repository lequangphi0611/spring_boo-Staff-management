package com.philqpd02256.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.philqpd02256.entity.Department;
import com.philqpd02256.entity.Staff;
import com.philqpd02256.service.DepartmentService;
import com.philqpd02256.service.StaffService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private StaffService staffService;
	
	@GetMapping("/all")
	public List<Department> getAll() {
		departmentService.insert(new Department("ID1", "Lớp Lớp"));
		departmentService.insert(new Department("ID2", "Lớp Đoản"));
		return departmentService.getAll();
	}
	
	@GetMapping("/staff-all")
	@ResponseBody
	public String getAllStaff() {
		Department department = departmentService.get("ID1");
		List<Staff> list =  staffService.getAllBy(department);
		for(Staff staff : list) {
			System.out.println(staff.toString());
		}
		return "^^^^";
	}
	
	
}
