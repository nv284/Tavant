package com.org.tav.day1;

public class Person {

	//instance variable
	String name ; int age  ; String address; 
	
	
	//declare a default cons 
	Person(){
		//Initialization of values of Instance variables
		name = "Nishi ";
		age = 35;
		address = " Maharshtra ";
		
	}
	
	
	void show() {
		System.out.println("Name : "+name +"   Age :"+age +" Address : "+address);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();//calling default 
		p.show();

	}

}
