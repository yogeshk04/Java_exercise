package com.course.exercise;

import java.util.Scanner;

public class switchcase1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the text: ");
		String text = input.nextLine();

		switch (text) {
		case "stop":
			System.out.println("Machine stopped.");
			break;

		case "start":
			System.out.println("Machine started.");
			break;
		default:
			System.out.println("No action...");
		}
		
		input.close();

	}

}
