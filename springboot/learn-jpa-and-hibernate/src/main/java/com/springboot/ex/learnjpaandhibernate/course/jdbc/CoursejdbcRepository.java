package com.springboot.ex.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.ex.learnjpaandhibernate.course.Course;

@Repository
public class CoursejdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY = """
			insert into course(id, name, author)
			values(?,?,?);
			""";

	private static String DELETE_QUERY = """
			delete from course
			where id=?;
			""";
			
	private static String SELECT_QUERY =
			"""
				select * from course
				where id = ?
			""";
			

	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, 
				course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deletebyId(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findByID(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class) , id);
	}
	
}
