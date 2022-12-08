package com.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	//courses
	//course:id,name,author
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllcourses(){
		return Arrays.asList(
				new Course(1,"Learn JAva","in30days"),
				new Course(2,"Learn DEvOps","in20days"),
				new Course(3,"Learn Python","in22days"),
				new Course(4,"Learn English","in2days"));
	}
}
