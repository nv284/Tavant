package com.org.tav.chain;

public class Chain {
Processor chain;

public Chain() {
	super();
	//this.chain = chain;
	buildChain();
}
private void buildChain() {
	chain = new NegativeProcess(new Zeroprocesser(new PositiveProcesser(null)) );
}
public void process(Number req) {
	chain.process(req);
}
}
