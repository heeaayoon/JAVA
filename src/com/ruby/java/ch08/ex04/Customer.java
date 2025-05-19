package com.ruby.java.ch08.ex04;

abstract class Customer {
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	abstract double applyDiscount(double totalAmount);

	public String getName() {
		return name;
	}
}