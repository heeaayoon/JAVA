package com.ruby.java.ch08.ex05;

public class MotorCycle implements Vehicle {
	int price;
	
	public MotorCycle(int price) {
		this.price = price;
	}

	@Override
	public void showVehicle() {
		System.out.println("MotorCycle/ 가격 = "+price);
	}
}