package com.bocobi.back.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Geordan
 * 
 * Un medecin peut dresser une ou plusieurs ordonnanes
 * Un patient possède une ou plusieurs ordonnances
 *
 */

@Entity
@Table
public class Ordonnance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Medecin medecin;
	
	@ManyToMany
	private Collection<Medicament> medicaments;
	
	@OneToMany(mappedBy = "ordonnance")
	private Collection<Examen> examens;
	
	/**
	 * Une ordonnance peut contenir plusieurs diagnostiques
	 */
	@OneToMany(mappedBy = "ordonnance")
	private Collection<Diagnostique> diagnostique;

	@OneToMany(mappedBy = "ordonnance")
	private Collection<Vaccin> vaccins;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Collection<Medicament> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(Collection<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	public Collection<Examen> getExamens() {
		return examens;
	}

	public void setExamens(Collection<Examen> examens) {
		this.examens = examens;
	}

	public Collection<Diagnostique> getDiagnostique() {
		return diagnostique;
	}

	public void setDiagnostique(Collection<Diagnostique> diagnostique) {
		this.diagnostique = diagnostique;
	}

	public Collection<Vaccin> getVaccins() {
		return vaccins;
	}

	public void setVaccins(Collection<Vaccin> vaccins) {
		this.vaccins = vaccins;
	}

	
}
