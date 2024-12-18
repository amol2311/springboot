package com.learn.sb.hello.sb.courses;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


record Course(int id, String name, String author) {
	@Override
	public String toString() {
		return "Course Id: "+id+" name: "+name+" author: "+author;
	}
}

//courses
//id name author
@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveCourses(){
		
		return Arrays.asList(new Course(101,"Machine Learning","UTA"),new Course(102,"NLP","UT"),
				new Course(103,"Deep Learning","UTD"),new Course(105,"Gen AI","UT2"));
	}
	
	

}
