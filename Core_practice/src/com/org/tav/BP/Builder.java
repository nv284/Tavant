package com.org.tav.BP;
//builder pattern allows step by step construction of different  Car models 

// all possible ways to configure a product 

//common builder interface 
public interface Builder {
	
void setCarType(CarType type );
void setSeats(int seats);
void setEngine(Engine engine);
void setTransmission(Transmission transmission);
void setTripComputer(TripComputer tripComputer);
void setGPSNavigator(GPSNavigator gpsNavigator);
}
