package com.lip6.entities;

public class Adresse {
	private String street;
	private String zip;
	private String city;
	
	public Adresse(String street, String zip, String city) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	
	public Adresse() {
	
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adresse [street=" + street + ", zip=" + zip + ", city=" + city + "]";
	}
	

	
	
}
