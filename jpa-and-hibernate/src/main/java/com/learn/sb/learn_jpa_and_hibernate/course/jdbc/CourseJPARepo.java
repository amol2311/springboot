package com.learn.sb.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insertCourse(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		// TODO Auto-generated method stub
		return entityManager.find(Course.class, id);
		
	}
	
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}

}
