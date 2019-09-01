package com.camposdeveloper.dealership.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Manufacturer;
import com.camposdeveloper.dealership.service.ManufacturerService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ManufacturerMutation implements GraphQLMutationResolver {
	
	@Autowired
	ManufacturerService manufacturerService;
	
	public Manufacturer saveManufacturer(Manufacturer manufacturer) {
		return manufacturerService.salvar(manufacturer);
	}
	
}
