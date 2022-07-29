package com.org.tav.FD;

public abstract class Plan {

	protected double rate ;
	abstract void getRate();
	
	public void caiculateBill(int units) {
		System.out.println(units*rate);
	}
}
