package com.camposdeveloper.dealership.domain;

public class Manufacturer {
	
	private Long id;
	private String name;
	private Long contactId;
	private Long addressId;
	
	/*
	 * Get's and Set's
	 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", name=" + name + ", contactId=" + contactId + "]";
	}
	
}
