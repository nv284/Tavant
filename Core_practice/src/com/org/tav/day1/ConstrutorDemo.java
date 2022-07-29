package com.org.tav.day1;

public class ConstrutorDemo {
	
	//Default 
	
	//------------------------
	String name ; int age  ; String address; 
	
	//this method will print - default 
	void show() {
		System.out.println("Name : "+name +"   Age :"+age +" Address : "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrutorDemo c1 = new ConstrutorDemo(); // calling default constructor 
		
		c1.show();

	}

}
