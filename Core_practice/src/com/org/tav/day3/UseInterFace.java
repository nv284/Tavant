package com.org.tav.day3;

import java.util.Scanner;

public class UseInterFace implements Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseInterFace u = new UseInterFace();
		u.add();
		u.sub();
		u.multi();
		u.div();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Enter two int value for addi");
		int a = k.nextInt(); int b = k.nextInt();
		int s = a+b;
		System.out.println("Sum of 2 digit :"+s);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Enter 2 int value for sub");
		int a = k.nextInt(); int b = k.nextInt();
		int s = a-b;
		System.out.println("Sub of 2 digit :"+s);
		
	}

	@Override
	public void multi() {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Enter two int value for multiplication ");
		int a = k.nextInt(); int b = k.nextInt();
		int s = a*b;
		System.out.println("Multiplication of 2 digit :"+s);
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("Enter two int value for addi");
		int a = k.nextInt(); int b = k.nextInt();
		int s = a/b;
		System.out.println("Div of 2 digit :"+s);
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}

}
