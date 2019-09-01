package com.camposdeveloper.dealership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.dealership.domain.Manufacturer;

@Service
public class ManufacturerService {
	
	List<Manufacturer> listManufacturer = new ArrayList<Manufacturer>();
	
	public Manufacturer salvar(Manufacturer manufacturer) {
		manufacturer.setId(Long.valueOf(listManufacturer.size() + 1));
		listManufacturer.add(manufacturer);
		return manufacturer;
	}
	
	public List<Manufacturer> findAll() {
		return listManufacturer;
	}
	
	public Manufacturer findAById (Long id) {
		for(Manufacturer manufacturer : listManufacturer) {
			if(manufacturer.getId().equals(id)) return manufacturer;
		}
		return null;
	}

}
