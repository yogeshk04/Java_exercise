package com.interview.java;

/*
	  EEEEE
	  DDDDD
	  CCCCC
	  BBBBB
	  AAAAA
 */
public class Pattern9 {
	public static void main(String[] args) {
		char a;
		char b;
		
		for(a='E';a>='A';a--) {
			for(b='E';b>='A';b--) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

}
