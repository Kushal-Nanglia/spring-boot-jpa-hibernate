package com.example.jpa.h2Jpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentJpaRepository {

	@Autowired
	EntityManager entityManager;
	
	public Student findById(int id) {
		return entityManager.find(Student.class, id);
	}
}
