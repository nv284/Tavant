package com.org.tav.day2;

public class Numberdata {
int x = 10; int y = 20;

	public Numberdata() {
	super();
	// TODO Auto-generated constructor stub
}
	Numberdata(Numberdata n){
		x=n.x;
		y=n.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberdata n = new Numberdata();
		System.out.println("Value of X "+n.x);
		System.out.println("value of Y : "+n.y);
		
		n.x=50; n.y=40;
		System.out.println("Update value ");
		System.out.println("Value of X "+n.x);//50
		System.out.println("value of Y : "+n.y);//40
		
		Numberdata n2 = new Numberdata();
		System.out.println("Not getting updated values of a and b in the new obj");
		System.out.println("Value of X "+n2.x);
		System.out.println("value of Y : "+n2.y);
		
		Numberdata n3 = new Numberdata(n);
		System.out.println("Getting updated values of x and y in new obj");
		System.out.println("Value of X "+n3.x);
		System.out.println("value of Y : "+n3.y);
		
		
	}

}
