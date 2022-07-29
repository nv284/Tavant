package com.org.tav.day3;

public class ImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "Hello"; 
		 String s2 = "Hello"; 
		 String s7= new String("Hello");
		 System.out.println(s1==s2);
		 System.out.println(s1==s7);
		 
		 String s3 = new String("Good bye"); 
		 String s4 = new String("Hello");
		 
		 String ss = new String("Football");//19811
		 String ss1 = new String("Football");//19812
		 
		 String ss2 = "Football";
		 String ss3 = "Football"; 
		 System.out.println(ss==ss1);//false
		 System.out.println(ss==ss2);//false
		 
		 System.out.println(ss==ss3);//false
		 System.out.println(ss2==ss3);//true
		 
		 
		 String s5 = "GOOD MORNING";
		 String s6 = new String ("Good morning");
		 System.out.println(s5.equals(s6));
		 System.out.println(s5.equalsIgnoreCase(s6));
		 
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals(s3));//false
		 
		 System.out.println(s1.equals(args));//false
		 System.out.println(s1.equals(null));//false
		 
		 if(s2.equals(s4)) 
			 { System.out.println("Both strings are equal");}//
			 else
			 { System.out.println("Both String are unqueal ");}
		 
	
	String m ="Mumbai";
	String m1 ="Mumbai";
	String r = "Ranchi";
	String p ="Pune";
	String n ="";
	
	System.out.println("equal" +m.compareTo(m1) );
	System.out.println(m.compareTo(r));//0
	System.out.println(m.compareTo(p));//-3
	System.out.println(r.compareTo(p));//
	System.out.println(p.compareTo(n));//+
	
	
	}

}
