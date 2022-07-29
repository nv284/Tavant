package com.org.tav.day1;

public class StaticTest {
static int x = 20; int y =30;
static {
	System.out.println(" Its loading before loading main method ");
}

void disp() {
	System.out.println(" Non-Static Method ");
	System.out.println(x);
	System.out.println(y);
}

static void show() {
	System.out.println(" Static Method ");
	System.out.println(x);
	//System.out.println(y);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
 StaticTest s1 = new StaticTest();
 s1.disp();
 show();
}

}
