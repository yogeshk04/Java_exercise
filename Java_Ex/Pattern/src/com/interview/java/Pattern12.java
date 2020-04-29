package com.interview.java;

/*
 * 1
 * 2 3
 * 3 4 5 
 * 5 6 7 8
 */
public class Pattern12 {
	public static void main(String[] args) {
		int count = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			count++;
			System.out.println();

		}
	}

}
