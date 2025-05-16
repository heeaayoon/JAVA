package com.ruby.java.ch07.상속;

public class Clothing extends Item2{
	private String size;
	private String color;
	
	public Clothing(String name, double price, int stockQuantity,String size,String color) {
		super(name, price, stockQuantity);
		this.size=size;
		this.color=color;
	}

	@Override
	public void show() {
		super.show();
		System.out.println(", 사이즈 : "+size+", 컬러 : "+ color);
	}

	@Override
	public String toString() {
		return null;
	}
}
