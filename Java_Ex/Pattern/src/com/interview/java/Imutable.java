package com.interview.java;

import java.util.Date;

public class Imutable {
	
	private String pan;
	
	private final Date date;
	
	public Imutable(String pan) {
		this.pan = pan;
		this.date = new Date();
	}
	
	public String getPan() {
		return this.pan;
	}
	
	public Date getDate() {
		return (Date) this.date.clone();
	}
	
	public void print() {
		System.out.println(pan);
	}

}
