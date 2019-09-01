package com.camposdeveloper.dealership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.dealership.domain.Motorcycle;

@Service
public class MotorcycleService {
	
	static List<Motorcycle> listMotorcycle = new ArrayList<Motorcycle>();
	
	public Motorcycle save(Motorcycle moto) {
		moto.setId(Long.valueOf(listMotorcycle.size() + 1));
		listMotorcycle.add(moto);
		return moto;
	}
	
	public Motorcycle findById(Long id) {
		for(Motorcycle moto : listMotorcycle) {
			if(moto.getId().equals(id)) return moto;
		}
		return null;
	}
	
	public List<Motorcycle> findAll() {
		return listMotorcycle;
	}
	

}
