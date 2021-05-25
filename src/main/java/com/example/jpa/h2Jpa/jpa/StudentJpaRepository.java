package com.example.jpa.h2Jpa.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class StudentJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Student> findAll() {
		TypedQuery<Student> namedQuery = entityManager.createNamedQuery("find_all_students", Student.class);
		return namedQuery.getResultList();
	}

	public Student findById(int id) {
		return entityManager.find(Student.class, id);
	}

	public Student update(Student person) {
		return entityManager.merge(person);
	}

	public Student insert(Student person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Student student = findById(id);
		entityManager.remove(student);
	}
}
