package com.hexa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Appointment {

	@Id
	private int aptId;
	private String pName;
	private long pContactNum;

	@ManyToOne
	@JoinColumn(name = "docId", referencedColumnName = "dId")
	private Doctors aptdoc;

	@ManyToOne
	@JoinColumn(name = "schId", referencedColumnName = "schId")
	private DoctorSchedule sch;

	public int getAptId() {
		return aptId;
	}

	public void setAptId(int aptId) {
		this.aptId = aptId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getpContactNum() {
		return pContactNum;
	}

	public void setpContactNum(long pContactNum) {
		this.pContactNum = pContactNum;
	}

	public Doctors getAptdoc() {
		return aptdoc;
	}

	public void setAptdoc(Doctors aptdoc) {
		this.aptdoc = aptdoc;
	}

	public DoctorSchedule getSch() {
		return sch;
	}

	public void setSch(DoctorSchedule sch) {
		this.sch = sch;
	}

}
