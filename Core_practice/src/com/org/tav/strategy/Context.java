package com.org.tav.strategy;

public class Context {

	private Strategy str ;

	public Context(Strategy str) {
		super();
		this.str = str;
	} 
	
	public float executeStr(float num1 , float num2) {
		return str.calculation(num1, num2);
	}
}
