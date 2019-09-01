package com.camposdeveloper.dealership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.dealership.domain.Manufactorer;

@Service
public class ManufactorerService {
	
	List<Manufactorer> listManufactorer = new ArrayList<Manufactorer>();
	
	public Manufactorer salvar(Manufactorer manufactorer) {
		manufactorer.setId(Long.valueOf(listManufactorer.size() + 1));
		listManufactorer.add(manufactorer);
		return manufactorer;
	}
	
	public List<Manufactorer> findAll() {
		return listManufactorer;
	}
	
	public Manufactorer findAById (Long id) {
		for(Manufactorer manufactorer : listManufactorer) {
			if(manufactorer.getId().equals(id)) return manufactorer;
		}
		return null;
	}

}
