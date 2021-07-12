package com.bocobi.back.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Medecin extends Utilisateur {
	
	private String grade;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String date_naiss;
	private String specialite;
	
	@OneToMany(mappedBy = "medecin")
	private Collection<RendezVous> rdv;
	
	@OneToMany(mappedBy = "medecin")
	private Collection<Ordonnance> ordonnances;
	
	public String getRole() {
		return "medecin";
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(String date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Collection<RendezVous> getRdv() {
		return rdv;
	}
	public void setRdv(Collection<RendezVous> rdv) {
		this.rdv = rdv;
	}
	public Collection<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	public void setOrdonnances(Collection<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

	
}
