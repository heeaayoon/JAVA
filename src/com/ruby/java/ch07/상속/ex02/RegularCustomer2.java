package com.ruby.java.ch07.상속.ex02;

public class RegularCustomer2 extends Customer2 {
	static final double REGULARDISCOUNT_RATE = 0.03;

	//생성자
	public RegularCustomer2(String name, String city, int age) {
		super(name,city,age);
	}

	@Override
	double applyDiscount(double totalAmount) {
		totalAmount*=REGULARDISCOUNT_RATE;
		return totalAmount;
	}
}
