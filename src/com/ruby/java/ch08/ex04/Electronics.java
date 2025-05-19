package com.ruby.java.ch08.ex04;

class Electronics extends Item {

	int madeYear;

	public Electronics(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;
	}
	
	@Override
	public void show() {
		System.out.println("제품명 :"+getName()+", 단가 : "+getPrice()+", 재고량 : "+getStockQuantity()+", 생산년도 : "+madeYear);
	}
}