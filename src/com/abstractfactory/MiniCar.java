package com.abstractfactory;

import com.abstractfactory.Location.*;

public class MiniCar extends Car {

	MiniCar(Location location){
		super(CarType.MINI,location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Connecting to Mini car....");
	}
}
