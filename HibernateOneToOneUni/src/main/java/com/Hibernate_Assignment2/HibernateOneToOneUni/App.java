package com.Hibernate_Assignment2.HibernateOneToOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Hibernate_Assignment2.HibernateOneToOneUni.config.HibernateConfig;
import com.Hibernate_Assignment2.HibernateOneToOneUni.entity.Address;
import com.Hibernate_Assignment2.HibernateOneToOneUni.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory = HibernateConfig.getSessionFactory();
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!");
        System.out.println("Config Loaded");
    	Address address = new Address("10004","Sangli","India","Maharashtra");
    	Student student = new Student("Kiran","4444444444",address);
//    	student.setId(2);
//    	address.setPin("10002");
//    	deleteStudent(student);
    	System.out.println(insertStudent(student));
    	
//    	address.setPin("10003");
//    	Session sess = factory.openSession();
//    	Transaction tx = sess.beginTransaction();
//    	sess.remove(address);
//    	tx.commit();
//    	sess.close();
    	
    }
    
	private static int insertStudent(Student student) {
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.persist(student);
    	tx.commit();
    	session.close();
    	return student.getId();
    }
    
    private static void deleteStudent(Student student) {
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.remove(student);
    	tx.commit();
    	session.close();
    }
}
