package com.lip6.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONNES")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_PERSONNE")
	private long idPersonne;
	private String civilite;
	private String nom;
	private String prenom;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PERSONNE_ADRESSE_ID")
	public Adresse adresse;

	public Personne(String civilite, String nom, String prenom, String email) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	

	public Personne( String civilite, String nom, String prenom, String email, Adresse adresse) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	public Personne() {

	}

	public long getId() {
		return idPersonne;
	}

	public void setId(long id) {
		this.idPersonne = id;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [id=" + idPersonne + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", myAdresse=" + adresse + "]";
	}

}