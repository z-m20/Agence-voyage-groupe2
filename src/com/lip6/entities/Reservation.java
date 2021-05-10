package com.lip6.entities;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservations")
public class Reservation {
	/* {author=Laure, version=1.0}*/


	//private ArrayList<Voyageur> listeVoyageur;
	private int numeroReservation;
	//private EtatsReservation etatReservation;
	//public Client  client;
	//public Assurance  assurance;
	//public Voyage  voyage;
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*public Reservation(ArrayList<Voyageur> listeVoyageur, int numeroReservation, EtatsReservation etatReservation) {
		this.listeVoyageur = listeVoyageur;
		this.numeroReservation = numeroReservation;
		this.etatReservation = etatReservation;
	}*/

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Reservation() {

	}


	/*public ArrayList<Voyageur> getListeVoyageur() {
		return listeVoyageur;
	}

	public void setListeVoyageur(ArrayList<Voyageur> listeVoyageur) {
		this.listeVoyageur = listeVoyageur;
	}*/

	public int getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	/*public EtatsReservation getEtatReservation() {
		return etatReservation;
	}

	public void setEtatReservation(EtatsReservation etatReservation) {
		this.etatReservation = etatReservation;
	}*/

	/*public void reserverVoyage(Client c) 
	{
		Scanner sc = new Scanner(System.in);
		int nbEssais = 0;
		boolean authentifie = false;
		while(authentifie == false) 
		{
			System.out.println("Insérez votre UserName suivi de votre PassWord");
			authentifie = c.authentification(sc.nextLine(), sc.nextLine());
			nbEssais++;
		}

		if(authentifie == true)
		{
			this.etatReservation = EtatsReservation.EnCours;
			System.out.println("Entrez le nombre de voyageurs");
			//Proposer le catalogue
			AgenceVoyageService agence = new AgenceVoyageService();
			for(Voyage v: agence.getOffres()) {
				v.toString();
			}
			int numVoyage = sc.nextInt();
			for(Voyage v: agence.getOffres()) {
				if(v.getNumeroVoyage() == numVoyage) {
					this.myVoyage = v;
				}
			}
			
			int nbVoyageurs = sc.nextInt();
			int i = 0;
			while (i<nbVoyageurs) 
			{
				Voyageur v = new Voyageur(sc.next(), sc.nextInt(), this);
				listeVoyageur.add(v);
			}
			System.out.println("Entrez le type d'assurance : 1- Assurance annulation 2- Autre");
			int typeAssurance = sc.nextInt();
			if(typeAssurance == 1) 
			{
				Contrat contrat = new Contrat();
				this.monAssurance = new AssuranceAnnulation(100, contrat, this);
			}
			// on doit inclure le prix du voyage
			prixTotal = this.monAssurance.prixAssurance * nbVoyageurs;
			System.out.println("Choisissez le mode de paiement : 1-CB 2-Cheque");
			int mode = sc.nextInt();
			if (mode == 1) 
			{
				CB cb = new CB(sc.nextInt(), sc.next());
				currentDate = new Date();
				if(Date.ValueOf(cb.getDateExpiration()).compareTo(new Date(System.currentTimeMillis()))>0) {
					//verifier le solde et contacter la banque
					this.etatReservation = EtatsReservation.Acceptee
					//payer(cb, prixTotal)
				}
			}
		}
	
		else {
			new Exception("Authentification obligatoire");
		}

	}*/

}