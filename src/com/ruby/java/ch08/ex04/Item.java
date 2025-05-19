package com.ruby.java.ch08.ex04;

abstract class Item {
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량

	public Item(String name, double price, int stockQuantity) {
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}

	public int reduceStock(int quantity) {
		stockQuantity-=quantity;
		return stockQuantity;
	}

	public void show() {
		System.out.println("제품명 :" + name + ", 단가 : " + price + ", 재고량 : " + stockQuantity);
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