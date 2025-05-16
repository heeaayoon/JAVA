package com.ruby.java.ch07.상속;

class RegularCustomer3 extends Customer3 {
	static final double REGULARDISCOUNT_RATE = 0.03;
	
	//생성자
	public RegularCustomer3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override //할인되는 금액
	double applyDiscount(double totalAmount) {
		//일반 고객은 고객할인만 적용됨
		totalAmount*=REGULARDISCOUNT_RATE;
		return totalAmount;
	}
}