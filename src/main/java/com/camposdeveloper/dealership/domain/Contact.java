package com.camposdeveloper.dealership.domain;

public class Contact {
	
	private Long id;
	private String email;
	private String telephone;
	private String cellphone;
	
	/*
	 * Get's and Set's
	 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", email=" + email + ", telephone=" + telephone + ", cellphone=" + cellphone + "]";
	}

}
