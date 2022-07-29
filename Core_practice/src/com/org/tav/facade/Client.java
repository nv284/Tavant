package com.org.tav.facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotelkeeper keeper = new Hotelkeeper();
		
		VegRestro v1 = keeper.getVegmenu();
		NonVegRestro v2 = keeper.getNonVegMenu();
		VenAndNonVeg v3 = keeper.getAndNonVeg();

	}

}
