package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Motorcycle;
import com.camposdeveloper.dealership.service.MotorcycleService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class MotorcycleQuery implements GraphQLQueryResolver {
	
	@Autowired
	MotorcycleService motoService;
	
	public List<Motorcycle> findMotorcycle() {
		return motoService.findAll();
	}
	
	public Motorcycle findMotorcycleById(Long id) {
		return motoService.findById(id);
	}
	
}
