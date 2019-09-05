package com.camposdeveloper.dealership.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.camposdeveloper.dealership.domain.Address;

@Service
public class AddressService {
	
	static List<Address> listAddress = new ArrayList<Address>();
	
	public Address save (Address address) {
		address.setId(Long.valueOf(listAddress.size() + 1));
		listAddress.add(address);
		return address;
	}
	
	public List<Address> findAll() {
		return listAddress;
	}
	
	public Address findById(Long id) {
		for(Address a : listAddress) {
			if(a.getId().equals(id)) return a;
		}
		return null;
	}

}
