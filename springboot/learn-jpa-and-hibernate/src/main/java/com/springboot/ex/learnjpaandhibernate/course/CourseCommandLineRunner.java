package com.springboot.ex.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.ex.learnjpaandhibernate.course.Course;
import com.springboot.ex.learnjpaandhibernate.course.jdbc.CoursejdbcRepository;
import com.springboot.ex.learnjpaandhibernate.course.jpa.CoursejpaRepository;
import com.springboot.ex.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CoursejdbcRepository repository;

//	@Autowired
//	private CoursejpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "AWS", "Unmeshanam"));
		repository.save(new Course(2, "JavaJPA", "Unmeshanam"));
		repository.save(new Course(3, "Python", "Unmeshanam"));

		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());

		System.out.println(repository.findByAuthor("Unmeshanam"));

		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("JavaJPA"));
	}

}
