package com.ruby.java.ch08.ex04;

class Clothing extends Item {
	
	int size;
	
	public Clothing(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
	}


	@Override
	public void show() {
		System.out.println("제품명 :"+getName()+", 단가 : "+getPrice()+", 재고량 : "+getStockQuantity()+", 사이즈 : "+size);
	}
}