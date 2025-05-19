package com.ruby.java.ch08.ex05;

public class Car implements Vehicle {
	int vehicleOccupants;
	
	public Car(int vehicleOccupants) {
		this.vehicleOccupants = vehicleOccupants;
	}

	@Override
	public void showVehicle() {
		System.out.println("Car/ 좌석수 = "+vehicleOccupants);
	}

	public int getVehicleOccupants() {
		return vehicleOccupants;
	}
}
