package com.lip6.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.lip6.entities.Contact;
import com.lip6.entities.Reservation;
import com.lip6.util.JpaUtil;

@Repository("RepDAO")
public class DAOContact implements com.lip6.daos.IDAOContact{

	public boolean testConfig() {
		 boolean success=false;

			try {
		    EntityManager em=JpaUtil.getEmf().createEntityManager();

			EntityTransaction tx =  em.getTransaction();
			tx.begin();
			
			Reservation res = new Reservation();
			res.setNumeroReservation(125);
			
			
			em.persist(res);
			
			tx.commit();
			 
			em.close();
			
			success=true;
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			return success;
	}
	
	/*@Override
	public void bonjour() {
		System.out.println("-----------------------Bonjour--------------------");
	}*/
	
	@Override
	public void bonjour(String firstname) {
		System.out.println("-----------------------Bonjour "+firstname+"---------------------");
	}
	
	@Override
	public boolean addContact(String firstName, String lastName, String email) {
		
		//Avant l'utilisation de classe JpaUtil	
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("projetJPA");
		
		//1: obtenir une connexion et un EntityManager, en passant par la classe JpaUtil
		
	    boolean success=false;

		try {
	    EntityManager em=JpaUtil.getEmf().createEntityManager();

		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet(s) metier (s)
		Contact contact = new Contact(firstName, lastName, email);
		
		
		// 4 : Persistance Objet/Relationnel : creation d'un enregistrement en base
		 
		
		em.persist(contact);
		
		//ici l'objet est dans un etat manager par l'EM, pas besoin d'un nouveau persist
		//contact.setLastName("Blanquito");
		
		
		// 5 : Fermeture transaction 
		tx.commit();
		
		//ici l'objet est dans un etat detache de l'EM, la modif ne sera pas commitee
		contact.setLastName("Blanchard");
		 
		// 6 : Fermeture de l'EntityManager et de unite de travail JPA 
		em.close();
		
		// 7: Attention important, cette action ne doit s'executer qu'une seule fois et non pas a  chaque instantiation du ContactDAO
		//Donc, pense bien a  ce qu'elle soit la derniere action de votre application
		//JpaUtil.close();	
		
		success=true;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return success;
		
	}
}
