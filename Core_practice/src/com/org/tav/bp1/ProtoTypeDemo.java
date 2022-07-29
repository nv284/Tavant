package com.org.tav.bp1;

import java.util.Scanner;

public class ProtoTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println(" Enter Employee id ");
     int eid = sc.nextInt();
     
     System.out.println(" Enter employee name ");
     String ename = sc.next();
     
     System.out.println("Enter designation ");
     String desg = sc.next();
     
     System.out.println("enter Address ");
     String add = sc.next();
     
     System.out.println("Enter salary ");
     double sal = sc.nextDouble();
     
     EmployeeRecord e1 = new EmployeeRecord(eid, ename, desg, sal, add);
     
     e1.shwoRecord();
     
     System.out.println("\n");
     
     EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
     e2.shwoRecord();
     
     EmployeeRecord e3 = (EmployeeRecord) e1.getClone();
     e3.shwoRecord();
     
     
     
	}

}
