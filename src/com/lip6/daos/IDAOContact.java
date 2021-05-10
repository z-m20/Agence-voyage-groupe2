package com.lip6.daos;

import com.lip6.entities.Contact;

public interface IDAOContact {

	
	public boolean addContact(String lastname, String firstname, String email);
	public boolean testConfig();
	public void bonjour(String firstname);
	//public void bonjour();
}
