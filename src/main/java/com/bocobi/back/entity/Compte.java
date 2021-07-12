package com.bocobi.back.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String login;

	private String password;

	private String pseudonyme;




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}
	
	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Compte) obj).id);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}

}
