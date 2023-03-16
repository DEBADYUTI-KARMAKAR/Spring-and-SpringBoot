package com.springboot.ex.learnjpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ex.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

	
}
