package com.ruby.java.ch07.상속;

public class SeasonalDiscount implements Discountable {
	private double seasonalDiscountRate = 0.1;
	
	@Override //시즌상품 추가 할인액
	public double getPlusDiscountedPrice(double price) {
		return price*=seasonalDiscountRate;
	}

}
