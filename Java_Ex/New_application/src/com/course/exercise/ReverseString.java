package com.course.exercise;

public class ReverseString {
	public static void main(String[] args) {
		String name = "I am Anil";

		String reName = reverse(name);

		System.out.println(reName);
	}

	public static String reverse(String str) {

		String revString  = "";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			
			for (int j = str1[i].length() - 1; j >= 0; j--) {
				revString += str1[i].charAt(j);
			}
			revString += " ";
		}

		return revString;
	}

}
