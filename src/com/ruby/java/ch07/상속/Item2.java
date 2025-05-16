package com.ruby.java.ch07.상속;
//부모 클래스 
public class Item2 {
	private String name;
	private double price;
	private int stockQuantity;
	
	//생성자
	public Item2(String name, double price, int stockQuantity) {
		this.name = name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}

	public void reduceStock(int quantity) {
		stockQuantity-=quantity;
	}

	public void increaseStock(int quantity) {
		stockQuantity+=quantity;
	}
	
	public void show() {
		System.out.println("제품명 : "+name+", 가격 : "+price+", 재고 : "+stockQuantity);
	}

	public double getPrice() {
		return price;
	}
}
