package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Contact;
import com.camposdeveloper.dealership.service.ContactService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ContactQuery implements GraphQLQueryResolver  {
	
	@Autowired
	ContactService contactService;
	
	public List<Contact> findContact() {
		return contactService.findAll();
	}
	
	public Contact findContactById(Long id) {
		return contactService.findById(id);
	}

}
