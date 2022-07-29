package com.org.tav.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class UserObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Sujit", "java", 50000);
		Employee e2 = new Employee(2, "Mohak", "Dot Net", 30000);
		Employee e3 = new Employee(3, "Harsha", "Java", 60000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.empId+"   "+e.name+"   "+e.sal);
		}

	}

}
