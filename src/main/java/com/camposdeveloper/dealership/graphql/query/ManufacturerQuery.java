package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Manufacturer;
import com.camposdeveloper.dealership.service.ManufacturerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ManufacturerQuery implements GraphQLQueryResolver {
	
	@Autowired
	ManufacturerService manufacturerService;
	
	public List<Manufacturer> findManufacturer() {
		return manufacturerService.findAll();
	}
	
	public Manufacturer findManufacturerById(Long id) {
		return manufacturerService.findAById(id);
	}

}
