package com.course.exercise;

public class RecursionExample {
	public static void main(String[] args) {
		System.out.println("Factorial of number : " + fact(5));
	}
	
	public static long fact(int num) {
		if(num <= 1)
			return 1;
		else
			return num * (num-1);
	}

}
