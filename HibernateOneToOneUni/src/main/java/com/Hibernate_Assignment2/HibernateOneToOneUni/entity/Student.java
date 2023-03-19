package com.Hibernate_Assignment2.HibernateOneToOneUni.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String phone;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public Student() {};
	
	public Student(String name, String phone, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}
