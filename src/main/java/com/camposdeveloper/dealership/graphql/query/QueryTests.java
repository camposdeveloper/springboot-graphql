package com.camposdeveloper.dealership.graphql.query;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class QueryTests implements GraphQLQueryResolver {
	
	public List<String> getListString(List<String> list) {
		for(String item : list) {
			System.out.println(item);
			System.out.println(item.getClass());
		}
		return list;
	}
	
	public List<Integer> getListInteger(List<Integer> list) {
		for(Integer item : list) {
			System.out.println(item);
			System.out.println(item.getClass());
		}
		return list;
	}

}
