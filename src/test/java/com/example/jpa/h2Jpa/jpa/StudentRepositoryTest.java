package com.example.jpa.h2Jpa.jpa;
import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.h2Jpa.H2JpaApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = H2JpaApplication.class)
public class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentJpaRepository repository;
	
	@Autowired
	EntityManager em;

	//Session & Session Factory
	//EntityManager & Persistence Context
	//Transaction
	
	@Test
	@Transactional
	public void someTest() {
		//Database Operation 1 - Retrieve student
		//Database Operation 2 - Retrieve passport
		//Database Operation 3 - update passport
	}

	@Test
	@Transactional
	public void retrieveStudentAndPassportDetails() {
		Student student = em.find(Student.class, 20001L);
		logger.info("student -> {}", student);
		logger.info("passport -> {}",student.getPassport());
	}
}