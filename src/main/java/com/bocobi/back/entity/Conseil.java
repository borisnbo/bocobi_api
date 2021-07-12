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
 *	Les conseils pouront à la limite être auto généré par le système...
 */

@Entity
@Table
public class Conseil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String auteur;
	private String nom;
	private String libelle;
	
	/**
	 * plusieurs conseils peuvent provenir d'une donnée.
	 */
	@ManyToOne
	private Donnee donnee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Donnee getDonnee() {
		return donnee;
	}

	public void setDonnee(Donnee donnee) {
		this.donnee = donnee;
	}



}
