package com.camposdeveloper.dealership.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Address;
import com.camposdeveloper.dealership.domain.Contact;
import com.camposdeveloper.dealership.domain.Manufacturer;
import com.camposdeveloper.dealership.service.AddressService;
import com.camposdeveloper.dealership.service.ContactService;
import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class ManufacturerResolver implements GraphQLResolver<Manufacturer> {
	
	@Autowired
	ContactService contactService;
	
	@Autowired
	AddressService AddressService;
	
	public Contact getContact(Manufacturer manufacturer) {
		return contactService.findById(manufacturer.getContactId());
	}
	
	public Address getAddress(Manufacturer manufacturer) {
		return AddressService.findById(manufacturer.getAddressId());
	}
	
}
