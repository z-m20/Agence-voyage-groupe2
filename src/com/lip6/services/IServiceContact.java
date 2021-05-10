package com.lip6.services;

import com.lip6.entities.Contact;

public interface IServiceContact {

	public void addContact(String firstname, String lastname, String email);
	public void addContact(Contact contact);

}
