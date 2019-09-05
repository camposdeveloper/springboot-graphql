package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Address;
import com.camposdeveloper.dealership.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class AddressQuery implements GraphQLQueryResolver  {
	
	@Autowired
	AddressService addressService;
	
	public List<Address> findAddress() {
		return addressService.findAll();
	}
	
	public Address findAddressById(Long id) {
		return addressService.findById(id);
	}

}
