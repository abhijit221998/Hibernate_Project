package com.Hibernate_Assignment5.HibernateManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate_Assignment5.HibernateManyToMany.config.HibernateConfig;
import com.Hibernate_Assignment5.HibernateManyToMany.entity.Employee;
import com.Hibernate_Assignment5.HibernateManyToMany.entity.Project;

public class App 
{
	private static SessionFactory factory = HibernateConfig.getSessionFactory();
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!");
        System.out.println("Config Loaded");
    	Employee e1 = new Employee("Sushant","sushant@123.com");
    	Employee e2 = new Employee("Amol","amol@123.com");
    	
    	Project p1 = new Project("Extc");
    	Project p2 = new Project("Biotechnology");
    	
    	List<Project> projects = new ArrayList<>();
    	projects.add(p1);
    	projects.add(p2);
    	List<Employee> employees = new ArrayList<>();
    	employees.add(e1);
    	employees.add(e2);
    	
    	e1.setPList(projects);
    	e2.setPList(projects);
    	p1.setEmpList(employees);
    	p2.setEmpList(employees);
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	session.persist(e1);
    	session.persist(e2);
    	session.persist(p1);
    	session.persist(p2);
    	tx.commit();
    	session.close();
    	
    	
    }
}
