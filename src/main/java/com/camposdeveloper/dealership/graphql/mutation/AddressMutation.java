package com.camposdeveloper.dealership.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Address;
import com.camposdeveloper.dealership.service.AddressService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class AddressMutation implements GraphQLMutationResolver {
	
	@Autowired
	AddressService addressService;
	
	public Address saveAddress (Address address) {
		return addressService.save(address);
	}

}
