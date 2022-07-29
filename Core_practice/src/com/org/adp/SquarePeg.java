package com.org.adp;
/*squarepegs are not compatiable wit roundholes, but we have to integrate them into our program
 * */
public class SquarePeg {
private double width;

public SquarePeg(double width) {
	super();
	this.width = width;
}

public double getWidth() {
	return width;
}

public double getSquare() {
	double result;
	result = Math.pow(this.width, 2);
	return result;
}
}
