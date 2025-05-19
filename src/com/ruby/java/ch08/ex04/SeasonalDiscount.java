package com.ruby.java.ch08.ex04;

class SeasonalDiscount implements Discountable {
	private double discountRate;
	
	public SeasonalDiscount(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public double geteasonalDiscountedPrice(double price) {
		price *= discountRate;
		return price;
	}

}