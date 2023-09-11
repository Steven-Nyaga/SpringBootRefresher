package com.steven.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	
	private String name;
	
	private String author;
	
	public Course() {
		
	}
	

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}



	public long getId() {
		return id;
	}


	public String getCourse() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + name + ", author=" + author + "]";
	}

}
