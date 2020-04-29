package com.course.exercise;

import com.couse.classes.clock;

public class clockMain {
	public static void main(String[] args) {
		clock clock = new clock();
		
		System.out.println(clock.toMilitary());
		
		clock.setTime(15, 41, 16);
		System.out.println(clock.toMilitary());
		System.out.println(clock.toString());		
	}
	
	

}
