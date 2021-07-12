package com.bocobi.back.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Alerte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
    private String code;  
    
    @ManyToOne
	private Donnee donnee; // plusieurs alertes peuvent provenir d'une donnée

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Donnee getDonnee() {
		return donnee;
	}

	public void setDonnee(Donnee donnee) {
		this.donnee = donnee;
	}
	
	
	
}
