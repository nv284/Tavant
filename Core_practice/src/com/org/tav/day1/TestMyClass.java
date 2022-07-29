package com.org.tav.day1;

class A{
	private String name ;
	private int sal = 50000;
	public int phone = 123456;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}

public class TestMyClass {
	
	private double radious = 1;
	public double getArea() {
		return radious *radious * Math.PI;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TestMyClass t1= new TestMyClass();
		System.out.println(" Radius "+t1.radious);
		System.out.println("Area of circle : "+ t1.getArea());
		
		A a = new A();
		
       a.setName("Java");
       System.out.println(" salary : "+ a.getSal());
       System.out.println(a.phone=456788);

	}

}
