package com.ruby.java.ch07.상속;

public class PremiumCustomer extends Customer2 {

	static final double PREMIUMDISCOUNT_RATE = 0.1;
	
	//생성자
	public PremiumCustomer(String cname, String city, int age) {
		super(cname, city, age);
	}
	
	@Override //할인되는 금액
	double applyDiscount(double totalAmount) {
		totalAmount *= PREMIUMDISCOUNT_RATE;
		return totalAmount;
	}

}
