package com.lip6.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lip6.daos.DAOReservation;
import com.lip6.daos.IDAOReservation;
import com.lip6.entities.Reservation;
import com.lip6.entities.Voyageur;

@Path("/Reservation")
@Service("ServiceReservation")
public class ServiceReservation {
	@Autowired
	@Qualifier("RepoReservation")
	private IDAOReservation daoReservation1;

	private IDAOReservation daoReservation = new DAOReservation();

	static private Map<String, Reservation> reservationContentProvider = new HashMap<>();
	private static Collection<Voyageur> listeVoyageur = new ArrayList<Voyageur>();

	public ServiceReservation() {
		System.out.println("ServiceReservation has been instansieted");
	}
	
	

	public static void addReservationtoContentProvider(Reservation reservation) {
		reservationContentProvider.put(reservation.getNumeroReservation(), reservation);
	}


	@Path("Voyageur")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void addVoyageur(@FormParam("civilite") String civilite, @FormParam("nom") String nom,
			@FormParam("prenom") String prenom, @FormParam("email") String email,
			@FormParam("numeroPieceIdentite") String numeroPieceIdentite, @FormParam("age") int age,
			@Context HttpServletResponse servletResponse, @Context HttpServletRequest servletRequest)
			throws IOException {
		Voyageur voyageur = new Voyageur(civilite, nom, prenom, email, numeroPieceIdentite, age);
		listeVoyageur.add(voyageur);
		System.out.println(listeVoyageur);
		servletResponse.sendRedirect(servletRequest.getContextPath() + "/CreateReservation-REST.jsp");
	}

	public void addVoyageur(String civilite, String nom, String prenom, String email, String numeroPieceIdentite,
			int age) {
		Voyageur voyageur = new Voyageur(civilite, nom, prenom, email, numeroPieceIdentite, age);
		listeVoyageur.add(voyageur);
		System.out.println(listeVoyageur);
	}

	public void addReservation1() {
		Reservation res = new Reservation();
		System.out.println("these are the travlers " + listeVoyageur);
		res.setListeVoyageur(listeVoyageur);
		res.setNumeroReservation(Long.toString(res.getId()));																					// changed
		System.out.println("this is the new reservation " + res);
		daoReservation1.addReservation(res);
		addReservationtoContentProvider(res);
		System.out.println(Arrays.asList(reservationContentProvider));
		listeVoyageur.clear();
	}

	@Path("validate")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void addReservation() {
		Reservation res = new Reservation();
		System.out.println("copy of list voyageur");
		Collection<Voyageur> listeDeVoyageurs = new ArrayList<Voyageur>(listeVoyageur);
		System.out.println("these are the travlers " + listeVoyageur);
		res.setListeVoyageur(listeDeVoyageurs);
		res.setNumeroReservation(Long.toHexString(Double.doubleToLongBits(Math.random())));// random string to be																					// changed
		//res.setNumeroReservation(Long.toString(res.getId()));
		System.out.println("this is the new reservation " + res);
		daoReservation.addReservation(res);
		addReservationtoContentProvider(res);
		System.out.println(Arrays.asList(reservationContentProvider));
		listeVoyageur.clear();
	}
	
	@Path("{numeroReservation}")
	@GET
	public void findListVoyageur(@PathParam("numeroReservation") String numeroReservation) {
		System.out.println("Les voyageurs de la reservation "+numeroReservation+" : ");
		System.out.println(reservationContentProvider.get(numeroReservation).getListeVoyageur()); 
	}
}