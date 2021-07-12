package com.bocobi.back.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Geordan
 *
 *	Un patient peut solicier un ou plusieurs rdv
 *
 *	Un rdv est accepté ou rejetté par un medecin
 */

@Entity
@Table
public class RendezVous {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date date;
	private Date heure;
	
	@ManyToOne
	private Patient patient;// un patient peut soliciter un po plusieurs rdv
	
	@ManyToOne
	private Medecin medecin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHeure() {
		return heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}


}
