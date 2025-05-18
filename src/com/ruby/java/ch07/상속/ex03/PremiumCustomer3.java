package com.ruby.java.ch07.���.ex03;

public class PremiumCustomer3 extends Customer3{
	
	static final double PREMIUMDISCOUNT_RATE = 0.1;

	//������
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
		return "�����̾� ��";
	}
}