package com.org.tav.observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AverageScoreDisplay a = new AverageScoreDisplay();
		CurrentScoreDisplay c = new CurrentScoreDisplay();
		
		CricketData data = new CricketData(c, a);
		
		data.dataChanged();

	}

}
