package com.hexa.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DoctorSchedule {
	
	@Id
	private int schId;
	private Date schDate;
	private int noOfApt;

	@OneToMany(mappedBy = "sch", fetch = FetchType.LAZY) // ---TO FETCH DATA FAST NOT LAZILY
	private Set<Appointment> aptlist;

	@ManyToOne
	@JoinColumn(name = "docId", referencedColumnName = "dId")
	private Doctors schdoc;

	public int getSchId() {
		return schId;
	}

	public void setSchId(int schId) {
		this.schId = schId;
	}

	public Date getSchDate() {
		return schDate;
	}

	public void setSchDate(Date schDate) {
		this.schDate = schDate;
	}

	public int getNoOfApt() {
		return noOfApt;
	}

	public void setNoOfApt(int noOfApt) {
		this.noOfApt = noOfApt;
	}

	public Doctors getSchdoc() {
		return schdoc;
	}

	public void setSchdoc(Doctors schdoc) {
		this.schdoc = schdoc;
	}

	public void setAptlist(Set<Appointment> aptlist) {
		this.aptlist = aptlist;
	}
}
