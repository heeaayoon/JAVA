package com.ruby.java.ch07.상속.ex03;

abstract class Item3 {
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량
	
	//생성자
	public Item3(String name,double price, int stockQuantity ) {
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


	//출력 메소드
	public void show() {
		System.out.println("제품종류 : "+name+", 제품단가 : "+price+", 재고량 : "+stockQuantity);
    }
}