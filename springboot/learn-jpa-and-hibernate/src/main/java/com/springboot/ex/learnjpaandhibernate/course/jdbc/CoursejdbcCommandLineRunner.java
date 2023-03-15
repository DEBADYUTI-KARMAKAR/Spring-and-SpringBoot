package com.springboot.ex.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.ex.learnjpaandhibernate.course.Course;

@Component
public class CoursejdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CoursejdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "AWS", "Unmeshanam"));
		repository.insert(new Course(2, "Java", "Unmeshanam"));
		repository.insert(new Course(3, "Python", "Unmeshanam"));

		
		repository.deletebyId(1);

		
	}

}
