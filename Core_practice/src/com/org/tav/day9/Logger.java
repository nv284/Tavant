package com.org.tav.day9;

public interface Logger {

	public void log(String message);
	
	static Logger info() {
		return message-> System.out.println(" Info : "+message); 
	}
	
	static Logger warning() {
		return message -> System.out.println("Warning : "+message);
	}
}
