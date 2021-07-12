package com.bocobi.back.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Patient extends Utilisateur{
	
	private String type;
	private String code;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
	private String date_naiss;
	
	@OneToMany(mappedBy = "patient")
	private Collection<RendezVous> rdv;
	
	@OneToMany(mappedBy = "patient")
	private Collection<Donnee> donnees;
	
	@OneToMany(mappedBy = "patient")
	private Collection<Ordonnance> ordonnances;
	
	@OneToOne
	private CarnetElectronique carnet;
	
	
	public String getRole() {
		return "patient";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Collection<RendezVous> getRdv() {
		return rdv;
	}
	public void setRdv(Collection<RendezVous> rdv) {
		this.rdv = rdv;
	}
	public Collection<Donnee> getDonnees() {
		return donnees;
	}
	public void setDonnees(Collection<Donnee> donnees) {
		this.donnees = donnees;
	}
	public Collection<Ordonnance> getOrdonnances() {
		return ordonnances;
	}
	public void setOrdonnances(Collection<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}
	public CarnetElectronique getCarnet() {
		return carnet;
	}
	public void setCarnet(CarnetElectronique carnet) {
		this.carnet = carnet;
	}
	
	
}
