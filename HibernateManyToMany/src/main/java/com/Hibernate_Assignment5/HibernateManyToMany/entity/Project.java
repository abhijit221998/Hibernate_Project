package com.Hibernate_Assignment5.HibernateManyToMany.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	@Column(name = "Project_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String pname;
	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;
	
	public Project() {}

	public Project(String pname) {
		super();
		this.pname = pname;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmpList() {
		return employees;
	}

	public void setEmpList(List<Employee> empList) {
		this.employees = empList;
	}

	@Override
	public String toString() {
		return "Project [Id=" + Id + ", pname=" + pname + ", empList=" + employees + "]";
	};
	
	
	
}
