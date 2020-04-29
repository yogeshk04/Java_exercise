package com.course.string;

import java.util.Scanner;

public class StringExamples {
	public static void main(String args[]) {
		String name = "I am Yogesh";

		String[] nameArray = name.split(" ");

		System.out.println("Enter the string:");

//		Scanner scan = new Scanner(System.in);
//		String srt = scan.nextLine();
//		scan.close();
		String reverseName = "";
		String reverseFullName = "";

		for (String temp : nameArray) {
			for (int i = temp.length() - 1; i >= 0; i--) {
				reverseName += temp.charAt(i);
			}
			reverseFullName = reverseFullName+ " " +reverseName;
			reverseName = "";
		}

		System.out.println("Original String: " + name);
		System.out.println("Reverse string is: " + reverseFullName);
	}

}
