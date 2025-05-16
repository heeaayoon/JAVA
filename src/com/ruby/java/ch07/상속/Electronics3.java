package com.ruby.java.ch07.상속;

public class Electronics3 extends Item3{
	int madeYear;
	
	public Electronics3(String name, int price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear=madeYear;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(", 제작연도 : "+madeYear);
	}
}
