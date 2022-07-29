package com.org.tav.day3;

public class StringBuilderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuilder sb = new StringBuilder("I love Java" );
      int len = sb.length();
      System.out.println("length : "+len);
      
      int capacity = sb.capacity();//(current capa * 2)+2 
      System.out.println("Capacity : "+capacity);
      sb.ensureCapacity(40);
      System.out.println("New Capacity : "+sb.capacity());
	}

}
