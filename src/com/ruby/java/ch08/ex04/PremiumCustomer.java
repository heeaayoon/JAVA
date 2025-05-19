package com.ruby.java.ch08.ex04;
class PremiumCustomer extends Customer {
	static final double PREMIUMDISCOUNT_RATE = 0.1;

	public PremiumCustomer(String name) {
		super(name);
	}

	@Override
	double applyDiscount(double totalAmount) {
		totalAmount *= PREMIUMDISCOUNT_RATE;
		return totalAmount;
	}
	
	@Override
	public String toString() {
		return "프리미엄 고객";
	}
}