package com.ruby.java.ch08.ex05;

public class Truck implements Vehicle {
	int weight;
	
	public Truck(int weight) {
		this.weight=weight;
	}

	@Override
	public void showVehicle() {
		System.out.println("Truck/ 무게 = "+weight);
	}
}