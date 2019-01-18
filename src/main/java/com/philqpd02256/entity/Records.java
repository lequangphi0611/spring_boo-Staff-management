package com.philqpd02256.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Records {
//	--property--
	private int idRecords;
	private boolean type;
	private String reason;
	private Date dateRecorded;
	
//	--relationship--
	private Staff staff;

	public Records() {
	}
	
	
	
	public Records(int idRecords, boolean type, String reason, Staff staff) {
		super();
		this.idRecords = idRecords;
		this.type = type;
		this.reason = reason;
		this.staff = staff;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getIdRecords() {
		return idRecords;
	}

	public void setIdRecords(int idRecords) {
		this.idRecords = idRecords;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	@Column(columnDefinition="nvarchar(255)")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	public Date getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_staff")
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	

}
