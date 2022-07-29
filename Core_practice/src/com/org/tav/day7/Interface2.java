package com.org.tav.day7;

public interface Interface2 {

	public void m2();
	
	default void move() {
		System.out.println(" this is java 8 default method !!!");
	}
	
	static void hello() {
		System.out.println(" called from interfce ---> interface2");
	}
}
