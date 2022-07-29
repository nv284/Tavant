package com.org.tav.day2;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(" New Thread running !!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread running ");
		MyThread t1 = new MyThread();
		Thread t = new Thread(t1);
		//t.start();
		t1.start();
		

	}

}
