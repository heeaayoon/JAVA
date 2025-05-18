package com.ruby.java.ch07.惑加.ex02;

public class Item2 { //何葛 皋家靛
	
	private String name;
	private double price;
	private int stockQuantity;

	//积己磊
	public Item2(String name,double price, int stockQuantity ) {
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

}