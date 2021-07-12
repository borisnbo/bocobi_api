package com.bocobi.back.entity;

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
 *	Classe chargé de la gestion des vaccins prescrit aux patients
 */

@Entity
@Table
public class Vaccin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String maladie;
	private String description;
	
	@ManyToOne
	private Ordonnance ordonnance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMaladie() {
		return maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ordonnance getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(Ordonnance ordonnance) {
		this.ordonnance = ordonnance;
	}
	
}
