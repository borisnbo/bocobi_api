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
 *	Un diagnostic est contenu dans plusieurs ordonnances,
 *
 */

@Entity
@Table
public class Diagnostique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String description;
	
	@ManyToOne
	private Ordonnance ordonnance;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
