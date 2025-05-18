package com.ruby.java.ch07.상속.ex02;

public class Electronics2 extends Item2{
	private int warranty; // 제품 보증 기간

	//생성자
		public Electronics2(String name,double price, int stockQuantity,int warranty) {
			super(name, price, stockQuantity);
			this.warranty=warranty;
		}
	
	public void show() {
		System.out.println("제품종류 : "+this.getName()+", 제품단가 : "+this.getPrice()+", 재고량 : "+this.getStockQuantity()+", 보증기간 : "+warranty);
	}

	@Override
	public String toString() {
		return "제품종류 : "+this.getName()+", 제품단가 : "+this.getPrice()+", 재고량 : "+this.getStockQuantity()+", 보증기간 : "+warranty;
	}
}