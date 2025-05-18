package com.ruby.java.ch07.상속.ex03;

public class Clothing3 extends Item3 {
	
	//필드 
	int size;


	//생성자 
	public Clothing3(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
		}
		
	@Override
	public void show() {
		System.out.println("제품종류 : "+getName()+", 제품단가 : "+getPrice()+", 재고량 : "+getStockQuantity()+", 사이즈 : "+size);
	}
}