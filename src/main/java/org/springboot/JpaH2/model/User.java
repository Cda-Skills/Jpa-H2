package org.springboot.JpaH2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Utilisateurs")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String famille;
	
	private String emailAdress;
	
	private String mot2pass;

	public User() {
		super();
	}

	public User(Long id, String famille, String emailAdress, String mot2pass) {
		super();
		this.id = id;
		this.famille = famille;
		this.emailAdress = emailAdress;
		this.mot2pass = mot2pass;
	}

	public Long getId() {
		return id;
	}

	public String getFamille() {
		return famille;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getMot2pass() {
		return mot2pass;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void setMot2pass(String mot2pass) {
		this.mot2pass = mot2pass;
	}
	
	
}
