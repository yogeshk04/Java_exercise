package com.interview.java;

import java.util.Date;

public class ImmutableTest {

	public static void main(String[] args) {
		Imutable i = new Imutable("Siemens");
		i.print();
		System.out.println("1. "+i);
		String pan = i.getPan();
		pan = "ashish";
		System.out.println("2. "+i.getPan());
		
		System.out.println("3. "+i.getDate());
		Date d = i.getDate();
		d.setMonth(3);
		System.out.println("4. "+i.getDate());
		
		i = new Imutable("siemensOne");
		System.out.println("5. "+i);
	}
}
