package com.sorting;

import java.util.*;

public class ArrayListDemo {
	
	public void listPrint() {
		ArrayList al = new ArrayList();
		al.add("Steve");
		al.add(111);
		al.add("Steve");
		al.add(null);
		
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "Monica");
		al.add("Number");
		System.out.println(al);
		
		
	}
}
