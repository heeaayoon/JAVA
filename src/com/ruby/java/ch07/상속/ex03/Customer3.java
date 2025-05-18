package com.ruby.java.ch07.상속.ex03;

abstract class Customer3 {
	private String name;
	
	//생성자
	public Customer3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract double applyDiscount(double totalAmount);

}