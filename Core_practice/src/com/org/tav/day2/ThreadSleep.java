package com.org.tav.day2;

public class ThreadSleep implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThreadSleep s = new ThreadSleep();
       Thread t1 = new Thread(s, "First Child Thread");
       
       ThreadSleep s1 = new ThreadSleep();
       Thread t2 = new Thread(s1, "Second Child Thread");
       t1.setPriority(3);
       t2.setPriority(8);
       
       t1.start(); t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
		
		
		
		
	}

}
