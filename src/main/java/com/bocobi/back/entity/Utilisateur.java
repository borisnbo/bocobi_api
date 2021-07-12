package com.bocobi.back.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Utilisateur {

	@Id
	@Column(updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String adress;
	private String sexe;
	private String photo;
	
	@OneToOne
	private Compte compte;
	
	// il faudra mettre une liaison avec les alertes, pour le patent et le médecin
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}
