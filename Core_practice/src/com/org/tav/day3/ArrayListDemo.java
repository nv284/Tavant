package com.org.tav.day3;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> a1 = new ArrayList<>();
       
       a1.add("apple");
     //
       a1.add("Grapes");
       a1.add("Pear");
       a1.add("Watermalon");
       a1.add(3, "Guava");
       a1.add(4, "Orange");
       a1.add(5, "Guava");
     // 
		
		System.out.println("Display List Data -> "+a1);
		
		System.out.println("where is Guava :"+a1.get(3));
		System.out.println("Increase capacity ");
		a1.ensureCapacity(20);
		//a1.trimToSize();
		
	}

}
