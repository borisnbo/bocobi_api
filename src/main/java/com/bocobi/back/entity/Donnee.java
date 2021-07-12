package com.bocobi.back.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Donnee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Patient patient;
	
	@OneToMany(mappedBy = "donnee")
	private Collection<Alerte> alertes; // une donnée peut produire plusieurs alertes
	
	@OneToMany(mappedBy = "donnee")
	private Collection<Conseil> conseils;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Collection<Alerte> getAlertes() {
		return alertes;
	}

	public void setAlertes(Collection<Alerte> alertes) {
		this.alertes = alertes;
	}

	public Collection<Conseil> getConseils() {
		return conseils;
	}

	public void setConseils(Collection<Conseil> conseils) {
		this.conseils = conseils;
	}
	

}
