package com.course.exercise;

public class Person {
	
	
	int rollNo;
	String name;
	
	
	public Person(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}
