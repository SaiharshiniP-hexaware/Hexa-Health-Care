package com.hexa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Specialization {
    
	@Id
	private int specId;
	private String specName;
	
	@OneToMany(mappedBy = "spec", fetch = FetchType.LAZY) // ---TO FETCH DATA FAST NOT LAZILY
	private Set<Doctors> dlist;
	
	public void setDlist(Set<Doctors> dlist) {
		this.dlist = dlist;
	}

	public int getSpecId() {
		return specId;
	}
	
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	
	public String getSpecName() {
		return specName;
	}
	
	public void setSpecName(String specName) {
		this.specName = specName;
	}
}
