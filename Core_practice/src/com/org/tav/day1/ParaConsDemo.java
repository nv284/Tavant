package com.org.tav.day1;

public class ParaConsDemo {
	
	
	public  ParaConsDemo() {
		System.out.println(" Zero Argument constutor ...");
	}
	
	public ParaConsDemo(int a ) {
		System.out.println(" One arument construtor");
	}
	
	public  ParaConsDemo(int a , int b) {
		System.out.println(" Two argument consturtor .."+a+""+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConsDemo p1 = new ParaConsDemo();//default 
		 p1 = new ParaConsDemo(100);
		 p1 = new ParaConsDemo(200, 300);

	}

}
