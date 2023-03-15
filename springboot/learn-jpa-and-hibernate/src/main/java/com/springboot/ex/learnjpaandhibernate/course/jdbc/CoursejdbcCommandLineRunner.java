package com.springboot.ex.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoursejdbcCommandLineRunner implements CommandLineRunner{
	@Autowired
	private CoursejdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert();
	}
	
	

}
