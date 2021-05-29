package com.example.jpa.h2Jpa.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Course> findAll() {
		TypedQuery<Course> namedQuery = entityManager.createNamedQuery("find_all_course", Course.class);
		return namedQuery.getResultList();
	}

	public Course findById(Long id) {
		return entityManager.find(Course.class, id);
	}

	public Course save(Course course) {
		if(course.getId() == null) {
			entityManager.persist(course);
		}
		else {
			entityManager.merge(course);
		}
		return course;
	}

	public Course insert(Course course) {
		return entityManager.merge(course);
	}

	public void deleteById(Long id) {
		Course course = findById(id);
		entityManager.remove(course);
	}

	public void playWithEntityManager() {
		Course course1 = new Course("Web Services in 100 Steps");
		entityManager.persist(course1);
		
		Course course2 = findById(10001L);
		
		course2.setName("JPA in 50 Steps - Updated");
	}
}
