package com.couse.classes;

import java.util.Scanner;

public class applicationClass {
	public static void main(String args[]) {
		MultiClass mc = new MultiClass(null);
		
		mc.simpleMessage();
		String name;
		int age;
				
		System.out.println("Enter you name: ");
		Scanner input = new Scanner(System.in);
		name = input.next();
		
		System.out.println("Enter your age: ");
		age = input.nextInt();
		input.close();
		
		
		mc.intro(name, age);
	}

}
