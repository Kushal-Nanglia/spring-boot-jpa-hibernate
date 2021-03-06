package com.example.jpa.h2Jpa.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_students", query="select s from Student s")

public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int marks;

	public Student() {
		
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
