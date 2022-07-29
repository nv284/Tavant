package com.org.tav.day1;

import java.util.Scanner;

public class Test {
	
	int a = 20 ; int b=30;static int x = 200;
	public int add(){
		return a+b+x;
	}
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name :");
		String name = sc.next();
		System.out.println("Welcome "+name);
		//name , maths , science , english , comp => totalmarks => per
		// when per more then 85 =A    
		System.out.println(" Enter the age");
		int age = sc.nextInt();
		
	Test t1 = new Test();
	
		System.out.println("Square root of 16 : "+Math.sqrt(16));
		System.out.println(t1.add());
		
	}
	

}
