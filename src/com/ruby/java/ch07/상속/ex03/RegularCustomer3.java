package com.ruby.java.ch07.���.ex03;

public class RegularCustomer3 extends Customer3{
	
	static final double REGULARDISCOUNT_RATE = 0.03;
	
	//������
	public RegularCustomer3(String name) {
		super(name);
	}

	@Override //�Ϲ� ���� �����θ� ����
	double applyDiscount(double totalAmount) {
		totalAmount*=REGULARDISCOUNT_RATE;
		return totalAmount;
	}
	
	@Override
	public String toString() {
		return "�Ϲݰ�";
	}
}
