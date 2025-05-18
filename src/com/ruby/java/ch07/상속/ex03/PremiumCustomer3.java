package com.ruby.java.ch07.惑加.ex03;

public class PremiumCustomer3 extends Customer3{
	
	static final double PREMIUMDISCOUNT_RATE = 0.1;

	//积己磊
	public PremiumCustomer3(String name) {
		super(name);
	}

	@Override
	double applyDiscount(double totalAmount) {
		totalAmount*=PREMIUMDISCOUNT_RATE;
		return totalAmount;
	}
	
	@Override
	public String toString() {
		return "橇府固决 绊按";
	}
}