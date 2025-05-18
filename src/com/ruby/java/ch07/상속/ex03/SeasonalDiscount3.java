package com.ruby.java.ch07.상속.ex03;

public class SeasonalDiscount3 implements Discountable3 {
	private double discountRate;
	
	//생성자 : discountRate를 외부에서 입력받기 위해 새로운 생성자를 만듦
	public SeasonalDiscount3(double discountRate) {
		this.discountRate = discountRate;
	}
	
	@Override
	public double getSeasonalDiscountedPrice(double price) {
		price *= discountRate;
		return price;
	}
}