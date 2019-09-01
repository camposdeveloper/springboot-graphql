package com.camposdeveloper.dealership.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Manufactorer;
import com.camposdeveloper.dealership.service.ManufactorerService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class ManufactorerMutation implements GraphQLMutationResolver {
	
	@Autowired
	ManufactorerService manufactorerService;
	
	public Manufactorer saveManufactorer(Manufactorer manufactorer) {
		return manufactorerService.salvar(manufactorer);
	}
	
}
