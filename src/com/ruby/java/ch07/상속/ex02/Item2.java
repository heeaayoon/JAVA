package com.ruby.java.ch07.���.ex02;

public class Item2 { //�θ� �޼ҵ�
	
	private String name;
	private double price;
	private int stockQuantity;

	//������
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