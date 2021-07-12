package com.bocobi.back.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class CarnetElectronique {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double poid;
	private double taille;
	private String groupeSanguin;
	
	@OneToOne(mappedBy = "carnet")
	private Patient patient;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPoid() {
		return poid;
	}

	public void setPoid(double poid) {
		this.poid = poid;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public String getGroupeSanguin() {
		return groupeSanguin;
	}

	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}
