package com.springboot.ex.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.ex.learnjpaandhibernate.course.Course;
import com.springboot.ex.learnjpaandhibernate.course.jdbc.CoursejdbcRepository;
import com.springboot.ex.learnjpaandhibernate.course.jpa.CoursejpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CoursejdbcRepository repository;

	@Autowired
	private CoursejpaRepository repository;

	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "AWS", "Unmeshanam"));
		repository.insert(new Course(2, "JavaJPA", "Unmeshanam"));
		repository.insert(new Course(3, "Python", "Unmeshanam"));

		
		repository.deleteById(1);
		System.out.println(repository.findById(2));

		
	}

}
