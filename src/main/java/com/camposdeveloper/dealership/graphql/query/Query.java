package com.camposdeveloper.dealership.graphql.query;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	
	public String getStatus() {
		return "GraphQL em execução!";
	}

}
