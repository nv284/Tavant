package com.org.tav.day1;

public class Student {

	String name ; int age  ; String address; //instance variable 
	static String SchoolName ="DAV" ; static String Section = "Yellow"; 
	
	//first manner 
	public Student (String name, int age  , String address) {
		System.out.println("First manner Constru call..");
		this.name = name ;
		this.age = age ;
		this.address = address;
		
		
	}
	
	static void change() {
		Section = "Brown";
	}
	void show() {
		System.out.println("Name : "+name +"   Age :"+age +" Address : "+address + "Section : "+Section+" "+SchoolName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s = new Student("a", 12, "BB");//calling cons
     Student.change();
     s.show();//calling method 
     Student s1 = new Student("a", 12, "BB");
     s1.show();
     Student s2 = new Student("a", 12, "BB");
     s2.show();
     Student s3= new Student("a", 12, "BB");
     s3.show();
     Student s4 = new Student("a", 12, "BB");
   s4.show();
   
	}

}
