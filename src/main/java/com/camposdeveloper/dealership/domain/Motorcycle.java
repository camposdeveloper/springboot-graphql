package com.camposdeveloper.dealership.domain;

import java.util.Date;

public class Motorcycle {
	
	private Long id;
	private String model;
	private Date year;
	private String color;
	private Integer km;
	private Manufacturer manufacturer;
	
	/*
	 * Get's and Set's
	 */
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Motorcycle [id=" + id + ", model=" + model + ", year=" + year
				+ ", color=" + color + ", km=" + km + ", manufacturer=" + manufacturer + "]";
	}

}
