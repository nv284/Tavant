package com.org.tav.day3;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String str = "";
		int len = str.length();
		System.out.println(" string length : "+len);
		
		String str2 = "Java is so powerful language";
		System.out.println("contain or not :"+str2.contains("Java"));
		int length = str2.length();
		System.out.println(" Length of str2 = "+length);
		
		char arr[] = {'j' , 'a' ,'v' , 'a'};
		String str3 = new String(arr);
		System.out.println("arr : "+str3.length());
		
		
		
		String s1 =str2.replace('s', 'p');
		System.out.println(s1);
		
		
		
		
		
	}

}
