package com.org.tav.day2;

class Emp{
	String name ; int rollno;

	public Emp(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
}
public class ArrayOfObject {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] e = new Emp[3];
		e[0]=new Emp("A", 1);
		e[1]=new Emp("B", 2);
		e[2]=new Emp("C", 3);
		
		for(int i=0;i<e.length;i++) {
			System.out.println("Name : "+e[i].name+"  "+"Roll no "+e[i].rollno);
		}
	}

}
