package com.org.tav.day1;

class Student1{
	
	//accout_no 
	//Account_bal
	
	static String name(String n) {
		return n;
	}
	static int rollno(int r) {
		return r;
	}
	static int std(int s) {
		return s;
	}
}



public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = Student1.name("Shivam");
		int rollno = Student1.rollno(100);
		int std = Student1.std(8);
		System.out.println("name of the student : "+name);
		System.out.println("Roll no  : "+rollno);
		System.out.println("Standard  : "+std);
	}

}
