package com.course.exercise;

public class variableLength {
	
	public static void main(String[] args) {
		System.out.println("Average is: "+average(10,20,10,20));
		
	}
	
	public static int average(int...num) {
		int total =0;
		for(int a: num) {
			total+=a;
			System.out.println(total);
		}
		
		return total/num.length;
		
		
	}

}
