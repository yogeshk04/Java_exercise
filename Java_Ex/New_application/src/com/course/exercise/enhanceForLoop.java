package com.course.exercise;

public class enhanceForLoop {
	
	public static void main(String[] args) {
		int numbers[] = {3,4,76,7,8,6,54,56};
		int total = 0;
		
		for(int n: numbers) {
			total+= n;
		}
		
		System.out.println("Total or array is: "+ total);
	}

}
	
