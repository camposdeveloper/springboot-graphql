package com.camposdeveloper.dealership.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Contact;
import com.camposdeveloper.dealership.domain.Manufacturer;
import com.camposdeveloper.dealership.service.ContactService;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class ManufacturerResolver implements GraphQLResolver<Manufacturer> {
	
	@Autowired
	ContactService contactService;
	
	public Contact getContact(Manufacturer manufacturer) {
		System.out.println("Resolver...");
		return contactService.findById(manufacturer.getId());
	}

}
