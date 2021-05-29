package com.example.jpa.h2Jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.h2Jpa.jpa.Course;
import com.example.jpa.h2Jpa.jpa.CourseJpaRepository;
import com.example.jpa.h2Jpa.jpa.Student;
import com.example.jpa.h2Jpa.jpa.StudentJpaRepository;

@SpringBootApplication
public class H2JpaApplication implements CommandLineRunner{
	
	@Autowired
	StudentJpaRepository studentRepository;
	
	@Autowired
	CourseJpaRepository courseRepository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(H2JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		studentRepository.saveStudentWithPassport();
		
		/*
		 * logger.info("Student with id:1 ->{}", studentRepository.findById(100));
		 * 
		 * logger.info("Inserting -> {}", studentRepository.insert(new
		 * Student("Shubham", 100)));
		 * 
		 * logger.info("Update 10003 -> {}", studentRepository.update(new Student(200,
		 * "Pieter", 200)));
		 * 
		 * studentRepository.deleteById(100);
		 * 
		 * logger.info("All users -> {}", studentRepository.findAll());
		 * 
		 * Course course = courseRepository.findById(10001L);
		 * logger.info("Course 10001 -> {}", course); courseRepository.save(new
		 * Course("Microservices in 100 Steps"));
		 */
	}

}
