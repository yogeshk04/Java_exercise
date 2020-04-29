package com.interview.java;

/*
	EDCBA
	EDCBA
	EDCBA
	EDCBA
	EDCBA
*/
public class Pattern10 {
	public static void main(String[] args) {
		char a;
		char b;

		for (a = 'E'; a >= 'A'; a--) {
			for (b = 'E'; b >= 'A'; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
	}

}
