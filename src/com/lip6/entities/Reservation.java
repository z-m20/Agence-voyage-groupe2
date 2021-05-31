package com.lip6.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RESERVATION")
	private long idReservation;
	
	@NotNull
	private String numeroReservation;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "VOYAGEUR_RESERVATIONS", joinColumns = @JoinColumn(name = "RESERVATION_ID", referencedColumnName = "ID_RESERVATION"), inverseJoinColumns = @JoinColumn(name = "VOYAGEUR_ID", referencedColumnName = "ID_PERSONNE"))
	private Collection<Voyageur> listeVoyageur;

	public Reservation() {
	}

	public Reservation(Collection<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}

	public long getId() {
		return idReservation;
	}

	public void setId(long id) {
		this.idReservation = id;
	}

	public Collection<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}

	public void setListeVoyageur(Collection<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}

	public String getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(String numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", numeroReservation=" + numeroReservation
				+ ", listeVoyageur=" + listeVoyageur + "]";
	}
	
}