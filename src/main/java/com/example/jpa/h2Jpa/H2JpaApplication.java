package com.example.jpa.h2Jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.h2Jpa.jpa.StudentJpaRepository;

@SpringBootApplication
public class H2JpaApplication implements CommandLineRunner{
	
	@Autowired
	StudentJpaRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(H2JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Student with id:1 ->{}", repository.findById(1)); 
	}

}
