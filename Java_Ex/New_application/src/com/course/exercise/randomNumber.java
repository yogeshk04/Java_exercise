package com.course.exercise;

import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		int number;
		
		for( int i =1; i<=10;i++) {
			//System.out.println("Number is : " + number);
			number = rnd.nextInt(100);
			
			System.out.print(1+number + " " );
		}
	}

}
