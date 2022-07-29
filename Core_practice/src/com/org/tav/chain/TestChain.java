package com.org.tav.chain;

public class TestChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chain chain = new Chain();
		chain.process(new Number(90));
		chain.process(new Number(-10));
		chain.process(new Number(0));
		
	}

}
