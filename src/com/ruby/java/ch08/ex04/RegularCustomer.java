package com.ruby.java.ch08.ex04;

class RegularCustomer extends Customer {
	
	static final double REGULARDISCOUNT_RATE = 0.03;
	
	public RegularCustomer(String name) {
		super(name);
	}

	@Override
	double applyDiscount(double totalAmount) {
		totalAmount *= REGULARDISCOUNT_RATE;
		return totalAmount;
	}

	@Override
	public String toString() {
		return "일반고객";
	}

}