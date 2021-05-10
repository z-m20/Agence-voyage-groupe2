package com.lip6.services;

import com.lip6.entities.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lip6.daos.DAOContact;
import com.lip6.daos.IDAOContact;


@Service("ServContact")
public class ServiceContact implements com.lip6.services.IServiceContact {
	
	@Autowired
	@Qualifier("RepDAO")
	private IDAOContact dao;
	
	public void addContact(String firstname, String lastname, String email){
		dao.addContact(firstname, lastname, email);
		dao.bonjour(firstname);
		//dao.bonjour();
	}
	
	/*public void addContact(Contact contact){
		dao.addContact(contact);
	}*/
	
	public Contact findContact(long idContact){
		DAOContact dao = new DAOContact();
		return null; //dao.getContact(idContact);
	}
	
	public void modifyContact(long idContact, String firstname, String lastname, String email){
		DAOContact dao = new DAOContact();
		//dao.modifyContact(idContact, firstname, lastname, email);
	}
	
	public void deleteContact(long idContact){
		DAOContact dao = new DAOContact();
		//dao.deleteContact(idContact);
	}

	@Override
	public void addContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	
}
