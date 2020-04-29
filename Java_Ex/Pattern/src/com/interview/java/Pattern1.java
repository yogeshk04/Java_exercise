package com.interview.java;


/*	
    1 
	2 3 
	4 5 6 
	7 8 
	9 
*/
public class Pattern1 {
	public static void main(String ar[]) {
		int count = 1;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		
		for(int i=2; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				System.out.print(" ");
				count++;
			}
			System.out.println();
		}
		
		
	}

}
