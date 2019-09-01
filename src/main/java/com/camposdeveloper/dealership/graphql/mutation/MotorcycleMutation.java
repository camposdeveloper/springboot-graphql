package com.camposdeveloper.dealership.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.camposdeveloper.dealership.domain.Motorcycle;
import com.camposdeveloper.dealership.service.MotorcycleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class MotorcycleMutation implements GraphQLMutationResolver{
	
	@Autowired
	MotorcycleService motoService;
	
	public Motorcycle saveMotorcycle(Motorcycle moto) {
		return motoService.save(moto);
	}

}
