package com.ruby.java.ch08.ex05;

public class Taxi extends Car implements Vehicle {
	
	int mileage;

	public Taxi(int vehicleOccupants, int mileage) {
		super(vehicleOccupants);
		this.mileage =mileage;
	}
	
	@Override
	public void showVehicle() {
		System.out.println("Taxi/ 좌석수 = "+getVehicleOccupants()+", 마일리지 = "+mileage);
	}
}
