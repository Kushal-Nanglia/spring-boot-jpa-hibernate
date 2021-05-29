package com.example.jpa.h2Jpa.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="find_all_students", query="select s from Student s")

public class Student {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@Column(nullable = true)
	private int marks;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Passport passport;

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
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "\n Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
