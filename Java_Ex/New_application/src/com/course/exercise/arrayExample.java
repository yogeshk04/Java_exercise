package com.course.exercise;

public class arrayExample {
	
	public static void main(String args[]) {
		int arr[] = new int[10];
		
		for(int i=1; i<arr.length;i++) {
			arr[i] = i;
		}
		
		System.out.println(arr[9]);
		
		for(int j = 1; j<arr.length;j++) {
			System.out.println("Array Element: " + arr[j]);
		}
	}

}
