package com.camposdeveloper.dealership.domain;

public class Manufactorer {
	
	private Long id;
	private String name;
	
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

	@Override
	public String toString() {
		return "Manufactorer [id=" + id + ", name=" + name + "]";
	}
	
}
