package com.org.tav.singlep;

public class DemoMutiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("If you see the same value , thensingleton was resued !!! "+"\n"+
				"If you see different values then 2 singletons were created "+ "\n\n"+ "Result :"+"\n");
			Thread t1 = new Thread(new ThreadFoo());
			Thread t2 = new Thread( new ThreadBar());
			
			t1.start();
			t2.start();
	}
	
	static class ThreadFoo implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Singleton s1 =  Singleton.getInstance("Foo");
			System.out.println(s1.value);
			
		}
		
	}
	static class ThreadBar implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Singleton s1 =  Singleton.getInstance("Bar");
			System.out.println(s1.value);
		}
		
	}

}
