package com.ruby.java.ch07.���.ex03;

public class SeasonalDiscount3 implements Discountable3 {
	private double discountRate;
	
	//������ : discountRate�� �ܺο��� �Է¹ޱ� ���� ���ο� �����ڸ� ����
	public SeasonalDiscount3(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public double getSeasonalDiscountedPrice(double price) {
		price *= discountRate;
		return price;
	}
}