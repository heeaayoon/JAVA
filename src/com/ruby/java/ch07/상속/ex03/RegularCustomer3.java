package com.ruby.java.ch07.상속.ex03;

public class RegularCustomer3 extends Customer3{
	
	static final double REGULARDISCOUNT_RATE = 0.03;
	
	//생성자
	public RegularCustomer3(String name) {
		super(name);
	}

	@Override //일반 고객은 고객할인만 적용
	double applyDiscount(double totalAmount) {
		totalAmount*=REGULARDISCOUNT_RATE;
		return totalAmount;
	}
	
	@Override
	public String toString() {
		return "일반고객";
	}
}
