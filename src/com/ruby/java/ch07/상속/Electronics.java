package com.ruby.java.ch07.상속;

public class Electronics extends Item2 {
	private int warranty; // 제품 보증 기간
	
	public Electronics(String name, double price, int stockQuantity, int warranty) {
		super(name, price, stockQuantity);
		this.warranty=warranty;
	}



	@Override
	public void show() {
		super.show();
		System.out.println(", 보증기간 : "+warranty);
	}

	@Override
	public String toString() {
		return null;
	}
}
