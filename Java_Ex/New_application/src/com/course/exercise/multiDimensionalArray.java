package com.course.exercise;

public class multiDimensionalArray {
	public static void main(String[] args) {
		int arr1 [][] = {{3,3,5,5,8},{6,5,4,3,7}};
		int arr2 [][] = {{2,3,5,7},{34},{55,4,3,3,5,6,7}};
		
		System.out.println("First array.");
		display(arr1);
		System.out.println("Second array.");
		display(arr2);
		
	}
	
	public static void display(int a[][]) {
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
		}
	}

}
