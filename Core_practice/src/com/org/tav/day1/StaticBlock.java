package com.org.tav.day1;

public class StaticBlock {
	//instance block
	{
		System.out.println("Instance Block -1");
	}
	{
		System.out.println("Instance Block -2");
	}
	//static block 
	static {
		System.out.println(" Static bloack -1");
	}
	static {
		System.out.println("Static block -2 ");
	}
	StaticBlock(){
		System.out.println("0-arg const");
	}
	StaticBlock(int a){
		System.out.println("1-arg ");
	}
	public static void main(String[] args) {
		new StaticBlock();
		new StaticBlock(20);
		// TODO Auto-generated method stub

	}

}
