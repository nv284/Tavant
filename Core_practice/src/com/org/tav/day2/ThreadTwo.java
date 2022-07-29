package com.org.tav.day2;

public class ThreadTwo implements Runnable {

	public static void main(String[] args) {
		System.out.println("Main Thread rinning");
		// TODO Auto-generated method stub
		ThreadTwo two = new ThreadTwo();
		Thread t = new Thread(two);//newBorn
		t.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\nThread is running now\n");
		System.out.println("New Thread running ....");
		for(int i = 1 ;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName());
	}

}
