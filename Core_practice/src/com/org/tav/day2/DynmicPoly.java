package com.org.tav.day2;


class BaseClass{
	void m1() {
		System.out.println("m1-Base class");
	}
}

class Derived extends BaseClass{
	void m1() {
		System.out.println("m1-derived class");
	}
}
public class DynmicPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Derived d = new Derived();
      d.m1();//derived
      BaseClass b = new BaseClass();
     // b.m1();//baseclass
	}

}
