package com.Hibernate_Assignment2.HibernateOneToOneUni.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	private String pin;
	private String city;
	private String state;
	private String country;
	
	public Address() {};
	
	public Address(String pin, String city, String state, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
	
}
