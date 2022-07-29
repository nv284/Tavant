package com.org.tav.facade;

public class Hotelkeeper {
public VegRestro getVegmenu() {
	VegRestro v = new VegRestro();
	
	return v;
}

public NonVegRestro getNonVegMenu() {
	NonVegRestro nv = new NonVegRestro();
	return nv;
}

public VenAndNonVeg getAndNonVeg() {
	VenAndNonVeg vn = new VenAndNonVeg();
	return vn;
}
}
