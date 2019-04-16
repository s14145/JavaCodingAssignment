package com.parkinglotDesingPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	
	protected List<ParkingSpot> parkingSpots=new ArrayList<ParkingSpot>();
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;
	
	public int getSpotsNeeded() {
		return spotsNeeded;
	}
	
	public VehicleSize getSize() {
		return size;
	}
	
	public void parkingSpot(ParkingSpot s) {
		parkingSpots.add(s);
	}

}
