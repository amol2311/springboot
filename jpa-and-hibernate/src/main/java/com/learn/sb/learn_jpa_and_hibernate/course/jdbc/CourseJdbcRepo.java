package com.learn.sb.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static String INSERT_QUERY=
			"""
			insert into course(id,name, author) values(1,'CSML','UTA');
			
			""";
	
	public static String INSERT_QUERY_WITH_PARAM=
			"""
			insert into course(id,name, author) values(?,?,?);
			
			""";
	
	public static String DELETE_QUERY_BY_ID=
			"""
			delete from course where id = ?;
			
			""";
	
	public static String FIND_BY_ID=
			"""
			select * from course where id = ?;
			
			""";
	
	public void addCourse() {
		jdbcTemplate.update(INSERT_QUERY);
	}

	
	public void insertCourse(Course course) {
		jdbcTemplate.update(INSERT_QUERY_WITH_PARAM,course.getId(),course.getName(), course.getAuthor() );
		
	}


	public void deleteById(long id) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(DELETE_QUERY_BY_ID,id);
	}
	
	public Course findById(long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(FIND_BY_ID,
				new BeanPropertyRowMapper<>(Course.class),id);
		
	}
}
