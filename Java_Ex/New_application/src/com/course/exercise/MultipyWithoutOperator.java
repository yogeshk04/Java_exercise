package com.course.exercise;

import java.util.Scanner;

public class MultipyWithoutOperator {
	public static void main(String[] args) {
		int a;
		int b;

		System.out.println("Print two numbers to multiply.");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();

		System.out.println("Multiplication of two numbers is: " + multipy(a, b));

	}

	static int multipy(int x, int y) {

		int multiplication = 0;

		if (y < 0) {
			y = -y;
			x = -x;
		}

		for (int i = 1; i <= y; i++) {

			multiplication += x;
		}
		return multiplication;
	}

}
