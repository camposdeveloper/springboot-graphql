package com.camposdeveloper.dealership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.dealership.domain.Contact;

@Service
public class ContactService {
	
	static List<Contact> contacts = new ArrayList<Contact>();
	
	public Contact save (Contact contact) {
		contact.setId(Long.valueOf(contacts.size() + 1));
		contacts.add(contact);
		return contact;
	}
	
	public List<Contact> findAll() {
		return contacts;
	}
	
	public Contact findById(Long id) {
		for(Contact c : contacts) {
			if(c.getId().equals(id)) return c;
		}
		return null;
	}

}
