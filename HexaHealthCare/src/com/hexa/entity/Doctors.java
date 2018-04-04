package com.hexa.entity;

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
public class Doctors {

	@Id
	private int dId;
	private String dName;
	private String dEmail;
	private long dContact;
	
	@ManyToOne
	@JoinColumn(name = "dSpecId", referencedColumnName = "specId")
	private Specialization spec;
	
	@OneToMany(mappedBy = "aptdoc", fetch = FetchType.LAZY) // ---TO FETCH DATA FAST NOT LAZILY
	private Set<Appointment> alist;
	@OneToMany(mappedBy = "schdoc", fetch = FetchType.LAZY) // ---TO FETCH DATA FAST NOT LAZILY
	private Set<DoctorSchedule> dslist;
	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public long getdContact() {
		return dContact;
	}

	public void setdContact(long dContact) {
		this.dContact = dContact;
	}

	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}

	public void setAlist(Set<Appointment> alist) {
		this.alist = alist;
	}

	public void setDslist(Set<DoctorSchedule> dslist) {
		this.dslist = dslist;
	}

	@Override
	public String toString() {
		return "dId=" + dId + ", dName=" + dName + ", dEmail=" + dEmail + ", dContact=" + dContact;
	}
	
	
}
