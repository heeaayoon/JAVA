package com.ruby.java.ch07.���.ex03;

abstract class Customer3 {
	private String name;
	
	//������
	public Customer3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract double applyDiscount(double totalAmount);

}