package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Manufactorer;
import com.camposdeveloper.dealership.service.ManufactorerService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ManufactorerQuery implements GraphQLQueryResolver {
	
	@Autowired
	ManufactorerService manufactorerService;
	
	public List<Manufactorer> findManufactorer() {
		return manufactorerService.findAll();
	}
	
	public Manufactorer findManufactorerById(Long id) {
		return manufactorerService.findAById(id);
	}

}
