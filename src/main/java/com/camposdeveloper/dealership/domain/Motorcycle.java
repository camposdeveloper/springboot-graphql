package com.camposdeveloper.dealership.domain;

import java.util.Date;

public class Motorcycle {
	
	private Long id;
	private String manufacturer;
	private String model;
	private Date year;
	private String color;
	private Integer km;
	
	/*
	 * Get's and Set's
	 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getKm() {
		return km;
	}
	public void setKm(Integer km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", year=" + year
				+ ", color=" + color + ", km=" + km + "]";
	}

}
