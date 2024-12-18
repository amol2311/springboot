package com.learn.sb.learn_jpa_and_hibernate.course.jdbc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepo  extends JpaRepository<Course, Long>{
	
	//custom methods also we can add if want
	List<Course> findByAuthor(String author);
	

}
