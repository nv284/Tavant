package com.org.tav.day4;

import java.util.Arrays;
import java.util.Collections;

//Comparable interface use to compare two object of the same , used for natural sorting 
//this interface can be implement by any custom class or user-defined if you want to use array or Collections sorting method 
//Comparable interface method => CompareTo() in  a way < , > + 
//declaration => public interface Comparable<T>
//it provide single sorting sequence i.e you can sort the element on the basis of single data member only . 
//compartTo() => + int (if current obj is greater then the specified obj =>this>Object) , -ve int(this<Object> , 0 (this= Object)
public class UseOfComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] st = new Student[3];
		st[0] = new Student(101, "harry", 12);
		st[1] = new Student(102, "Carl", 18);
		st[2] = new Student(105, "Tony", 10);
		
		//Collections.sort(st);
		Arrays.sort(st);
		
		for(Student s :st)
			System.out.println("name "+s.name +" Rollno : "+s.rollno+ " Age :  "+s.age);
	}

}
