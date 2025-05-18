package com.ruby.java.ch07.상속.ex02;

public class Clothing2 extends Item2 {
	private String size;
	private String color;
	
	//생성자
	public Clothing2(String name,double price, int stockQuantity,String size, String color) {
		super(name, price, stockQuantity);
		this.color=color;
		this.size=size;
	}
	
	//정보 출력 매소드
	public void show() {
		System.out.println("제품종류 : "+this.getName()+", 제품단가 : "+this.getPrice()+", 재고량 : "+this.getStockQuantity()+", 사이즈 : "+size+", 컬러 : "+color);
	}

	@Override
	public String toString() {
		return "제품종류 : "+this.getName()+", 제품단가 : "+this.getPrice()+", 재고량 : "+this.getStockQuantity()+", 사이즈 : "+size+", 컬러 : "+color;
	}
}
