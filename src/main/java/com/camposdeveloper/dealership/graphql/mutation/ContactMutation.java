package com.camposdeveloper.dealership.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Contact;
import com.camposdeveloper.dealership.service.ContactService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ContactMutation implements GraphQLMutationResolver {
	
	@Autowired
	ContactService contactService;
	
	public Contact saveContact (Contact contact) {
		return contactService.save(contact);
	}

}
