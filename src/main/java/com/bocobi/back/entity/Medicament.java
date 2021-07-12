package com.bocobi.back.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 * @author Geordan
 *
 *Classe chargé de manager les médicaments
 * Une ordonnance peur contenir plusieurs médicaments
 * Un médicament peut être contenu dans une ou plusieurs ordonnances
 */

@Entity
@Table
public class Medicament {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String description;
	@ManyToMany
	private Collection<Ordonnance> ordonnances;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Ordonnance> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(Collection<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}


}
