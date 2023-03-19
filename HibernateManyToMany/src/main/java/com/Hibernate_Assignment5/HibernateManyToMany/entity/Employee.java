package com.Hibernate_Assignment5.HibernateManyToMany.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@Column(name = "Emp_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String email;
	@ManyToMany
	@JoinTable(name = "employee_project", joinColumns = { @JoinColumn(name = "employee_id") }, inverseJoinColumns = {
			@JoinColumn(name = "project_id") })
	private List<Project> projects;

	public Employee() {
	}

	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Project> getPList() {
		return projects;
	}

	public void setPList(List<Project> pList) {
		projects = pList;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", email=" + email + ", Projects=" + projects + "]";
	};

}
