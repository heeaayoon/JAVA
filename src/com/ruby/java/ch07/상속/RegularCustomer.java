package com.ruby.java.ch07.상속;

public class RegularCustomer extends Customer2{
	static final double REGULARDISCOUNT_RATE = 0.03;
	//생성자
	public RegularCustomer(String cname, String city, int age) {
		super(cname,city,age);
	}
	
	@Override
	double applyDiscount(double totalAmount) {
		totalAmount*=REGULARDISCOUNT_RATE;
		return totalAmount;
	}

}
