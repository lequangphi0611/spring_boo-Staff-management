package com.philqpd02256.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Department {
	
//	--property--
	private String idDepartment;
	private String departmentName;

//	--relationship--
	private List<Staff> staff = new ArrayList<>();
	
	public Department() {
		
	}

	public Department(String idDepartment, String departmentName) {
		this.idDepartment = idDepartment;
		this.departmentName = departmentName;
	}

	@Id
	@Column(name="id_department",length=7)
	public String getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(String idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Column(nullable=false,unique=true,columnDefinition="nvarchar(50)")
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=Staff.class,mappedBy="department")
	public List<Staff> getStaff() {
		return staff;
	}
	
	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}
	
	@Override
	@Transient
		public String toString() {
			return this.departmentName;
		}

}
