package com.learn.sb.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	//@Autowired
	//private CourseJdbcRepo repo;     // Option 1: SPring JDBC
	
	//@Autowired
	//private CourseJPARepo repo;  //  Option 2:  JPA
	
	@Autowired
	private CourseSpringDataJPARepo repo; // Option 3:  Spring data JPA 

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//repo.addCourse();
		/**
		 * below work for first 2 options 
		 */
		/*
		 * repo.insertCourse(new Course(3,"CS","Test")); repo.insertCourse(new
		 * Course(4,"CS","Test")); repo.insertCourse(new Course(5,"CS","Test"));
		 * 
		 * repo.deleteById(4);
		 * 
		 * System.out.println(repo.findById(5));
		 */
		
		
		//for Spring Data JPA
		repo.save(new Course(3,"CS","Test"));
		repo.save(new Course(4,"CS","Test"));
		repo.save(new Course(5,"CS","Test"));
		
		repo.save(new Course(50,"CS","Test2"));
		repo.save(new Course(51,"CS","Test3"));
		repo.save(new Course(52,"CS","Test4"));
		
		
		repo.deleteById(4l);
		 System.out.println(repo.findById(5l));
		
		 
		 System.out.println(repo.findByAuthor("Test"));
		 
		
	}

}
