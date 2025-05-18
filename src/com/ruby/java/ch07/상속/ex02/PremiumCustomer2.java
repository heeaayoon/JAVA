package com.ruby.java.ch07.상속.ex02;

public class PremiumCustomer2 extends Customer2 {
	static final double PREMIUMDISCOUNT_RATE = 0.1;
	
	//생성자
	public PremiumCustomer2(String name, String city, int age) {
		super(name,city,age);
	}

	@Override
	double applyDiscount(double totalAmount) {
		totalAmount*=PREMIUMDISCOUNT_RATE;
		return totalAmount;
	}
}