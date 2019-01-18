package com.philqpd02256.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Staff {

//	----Property-----
	private String idStaff;
	private String staffName;
	private boolean gender;
	private String image;
	private Date birthday;
	private long salary;
	private String email;
	private String phone;
	private String notes;

//	---relationship---
	private Department department;
	private List<Records> records = new ArrayList<>();

	public Staff() {
	}

	public Staff(String idStaff, String staffName, boolean gender, String image, Date birthday, long salary,
			String email, String phone, String notes, Department department) {
		super();
		this.idStaff = idStaff;
		this.staffName = staffName;
		this.gender = gender;
		this.image = image;
		this.birthday = birthday;
		this.salary = salary;
		this.email = email;
		this.phone = phone;
		this.notes = notes;
		this.department = department;
	}

	@Id
	@Column(name = "id_staff", length = 15)
	public String getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(String idStaff) {
		this.idStaff = idStaff;
	}

	@Column(nullable = false, columnDefinition="nvarchar(30)")
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	@ColumnDefault("1")
	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@ColumnDefault("'default.jpg'")
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Temporal(TemporalType.DATE)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(nullable = false)
	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_department")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(nullable=false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(nullable=false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(columnDefinition="nvarchar(255)")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity=Records.class,mappedBy="staff")
	public List<Records> getRecords() {
		return records;
	}

	public void setRecords(List<Records> records) {
		this.records = records;
	}

	@Override
	@Transient
	public String toString() {
		return "Staff [idStaff=" + idStaff + ", staffName=" + staffName + ", gender=" + gender + ", image=" + image
				+ ", birthday=" + birthday + ", salary=" + salary + ", email=" + email + ", phone=" + phone + ", notes="
				+ notes + ", department=" + department + ", records=" + records + "]";
	}
	
	

}
