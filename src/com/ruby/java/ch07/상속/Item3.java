package com.ruby.java.ch07.상속;

abstract class Item3 {
	private String name; // 제품명
	private double price; // 제품 가격
	private int stockQuantity; // 재고량

	//생성자
    public Item3(String name, double price, int stockQuantity) {
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
    
   // 재고 감소 메소드
	public void reduceStock(int quantity) {
		stockQuantity-=quantity;
	}

	public void show() {
		System.out.println("제품명 : "+name+", 제품가격 : "+price+"$ , 재고량 : "+stockQuantity);
	}

	public double getPrice() {
		return price;
	}
}
