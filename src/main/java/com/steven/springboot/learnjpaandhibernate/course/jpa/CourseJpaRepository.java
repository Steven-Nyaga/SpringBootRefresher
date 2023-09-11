package com.steven.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.steven.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
//When using entity manager you need transactions hence
@Transactional
public class CourseJpaRepository {

	//Instead of injecting using Autowired you use the below just to specify you are injecting entity  manager
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void removeById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
}
