package com.org.tav.day2;

public class StaticPoly {
	
	void sum(int x , int y) {
		int s = x+y;
		System.out.println("sum of 2 no "+s);
	}
	
	void sum(int x , int y , int z) {
		int s = x+y+z;
		System.out.println("sum of 3 no "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StaticPoly s1 = new StaticPoly();
         s1.sum(10, 20);
         s1.sum(10, 20, 30);
	}

}
