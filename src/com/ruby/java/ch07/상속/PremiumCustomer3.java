package com.ruby.java.ch07.상속;


class PremiumCustomer3 extends Customer3 {
	static final double PREMIUMDISCOUNT_RATE = 0.1;
	
	public PremiumCustomer3(String name) {
		super(name);
	}

	@Override //할인되는 금액
	double applyDiscount(double totalAmount) {
		totalAmount*=PREMIUMDISCOUNT_RATE;
		return totalAmount;
	}
}