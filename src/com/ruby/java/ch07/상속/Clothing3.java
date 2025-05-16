package com.ruby.java.ch07.상속;

public class Clothing3 extends Item3{
	int size;
	
	public Clothing3(String name, int price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size=size;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(", 사이즈 : "+size);
	}
}
