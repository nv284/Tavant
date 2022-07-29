package com.org.tav.day3;

public class SubStrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = new String("SachinTendulkar");
   s.substring(5);//nTendulkar
   System.out.println(s);
   
   String s2 = s.substring(6, 15);
   System.out.println(s2);
   
   String s3 = s2.substring(3);
   System.out.println(s3);
   
   String s4 = "helloJava";
   String s5 = s4.substring(5);
   System.out.println(s5);
   
   String s6= s4.substring(3,8);
   System.out.println(s6);
   
	}

}
