package com.org.tav.day4;
class T{
	int t = 20;
	T() {
		t = 40;
	}
}
public class Main {
	int m_x, m_y;
	   
	  public Main(int x, int y) { m_x = x; m_y = y; }
	  public Main() { this(10, 10); }
	  public int getX() { return m_x; }
	  public int getY() { return m_y; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t1 = new T();
		Main m = new Main();
		System.out.println(t1.t);
		System.out.println(m.getX());
	}

}
