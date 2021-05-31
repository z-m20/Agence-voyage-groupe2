package com.lip6.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Voyageurs")
public class Voyageur extends Personne {
	private String numeroPieceIdentite;
	private int age;
	@ManyToMany(mappedBy = "listeVoyageur", cascade = CascadeType.ALL)
	public Collection<Reservation> reservations;

	public Voyageur(String civilite, String nom, String prenom, String email, String numeroPieceIdentite, int age) {
		super(civilite, nom, prenom, email);
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;
	}
	

	public Voyageur( String civilite, String nom, String prenom, String email, Adresse adresse, String numeroPieceIdentite, int age) {
		super(civilite, nom, prenom, email, adresse);
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;
	}


	public Voyageur(String numeroPieceIdentite, int age) {
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;

	}

	public Voyageur() {

	}

	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}

	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Collection<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [numeroPieceIdentite=" + numeroPieceIdentite + ", age=" + age + ", myAdresse=" + adresse
				+ ", getId()=" + getId() + ", getCivilite()=" + getCivilite() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getEmail()=" + getEmail() + "]";
	}

}