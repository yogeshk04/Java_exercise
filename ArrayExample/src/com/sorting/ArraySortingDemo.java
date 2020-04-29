package com.sorting;

import java.util.Arrays;


public class ArraySortingDemo {
	public static void main(String[] arrg) {
		// Initialize unsorted short array
		short sArr[] = {22,13,32,22,10,5,45,4,5};
		
		//let use print hte elements available in list
		for(short num : sArr) {
			System.out.println("Numbers = " + num);			
		}
		
		//sorting the array
		Arrays.sort(sArr);
		
		//print all the elements available in list
		System.out.println("The sorted array is: ");
		for ( short num : sArr) {
			System.out.println("Number: " + num);
		}
		
		
		ArrayListDemo ald = new ArrayListDemo();
		ald.listPrint();
	}

}
