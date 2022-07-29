package com.org.tav.BP;

//builder of a Car manual 
//in this case we would build a user manual for a car using the same steps as we built a car .
//this allows to produce manuals for specific car models configured with diff featires .
public class CarManualBuilder implements Builder {
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;
	@Override
	public void setCarType(CarType type) {
		// TODO Auto-generated method stub
		this.type= type;
		
	}

	@Override
	public void setSeats(int seats) {
		// TODO Auto-generated method stub
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		// TODO Auto-generated method stub
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		// TODO Auto-generated method stub
		this.transmission=transmission;
		
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		// TODO Auto-generated method stub
		this.tripComputer=tripComputer;
		
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		// TODO Auto-generated method stub
		this.gpsNavigator= gpsNavigator;
		
	}
	public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
