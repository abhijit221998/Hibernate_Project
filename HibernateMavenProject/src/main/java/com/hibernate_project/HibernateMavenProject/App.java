package com.hibernate_project.HibernateMavenProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate_project.HibernateMavenProject.Config.HibernateConfig;
import com.hibernate_project.HibernateMavenProject.entity.Teacher;
/**
 * Hello world!
 *
 */
public class App 
{
	private static SessionFactory factory = HibernateConfig.getSessionFactory();
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Config Loaded");
        Teacher a1 = new Teacher("Robin", "Hooda", "hoodaRobin23@gmail.com");
        System.out.println(a1);
//        System.out.println(insertTeacher(a1));
        
//        Teacher a1 = new Teacher("Jon", "Cook", "cook57@gmail.com");
//        a1.setF_name("Alaister");
//        a1.setTid(1);
////		System.out.println(a1);
//		System.out.println(updatedTeacher(a1));
		
//		Teacher a1 = new Teacher("Ross", "Taylor", "rossTaylor@gmail.com");
//		a1.setF_name("Ross");
//        a1.setTid(2);
//		System.out.println(a1);
//		deleteTeacher(a1);
		
//		Teacher a1 = new Teacher("Robin", "Hooda", "hoodaRobin23@gmail.com");
//		a1.setF_name("Kane");
//        a1.setTid(3);
//		System.out.println(a1);
//		System.out.println(getTeacherById(3));
//		for(Teacher teacher : getAllTeachers())
//		{
//			System.out.println(teacher);
//		}
    }
    
    //Insert
    public static int insertTeacher(Teacher teacher)
    {
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.persist(teacher);
    	tx.commit();
    	session.close();
    	return teacher.getTid();
    }
    
    //Update 
    public static Teacher updatedTeacher(Teacher teacher)
    {
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	Teacher updatedTeacher = session.merge(teacher);
    	tx.commit();
    	session.close();
    	return updatedTeacher;
    }
    
    
    //delete
    public static void deleteTeacher(Teacher teacher)
    {
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	session.remove(teacher);
    	tx.commit();
    	session.close();
    }
    
    //TeacherById
    public static Teacher getTeacherById(int teacherid)
    {
    	Session session = factory.openSession();
    	Teacher teacher = session.get(Teacher.class, teacherid);
    	session.close();
    	return teacher;
    }
    
    //Get all teachers
    public static List<Teacher> getAllTeachers()
	{
		Session session = factory.openSession();
		List<Teacher> teachers = session.createQuery("select a from Teacher a", Teacher.class).getResultList();
		session.close();
		return teachers;
	}
    
}
