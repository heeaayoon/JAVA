package com.ruby.java.ch07.상속.ex03;

public class Electronics3 extends Item3 {
	
	//필드
	int madeYear;

	
	//생성자 
	public Electronics3(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;
	}
	
	@Override
	public void show() {
		System.out.println("제품종류 : "+getName()+", 제품단가 : "+getPrice()+", 재고량 : "+getStockQuantity()+", 생산년도 : "+madeYear);
	}
}