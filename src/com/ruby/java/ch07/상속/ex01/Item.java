package com.ruby.java.ch07.상속.ex01;

public class Item { //제품 클래스
	private String name; // 제품명
    private double price; // 제품 단가
    private int stockQuantity; // 재고량

    //생성자
    public Item(String name, double price, int stockQuantity) {
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
    
    // 재고 감소 메소드
    public void reduceStock(int quantity) {
    	stockQuantity-=quantity;
    }

    // 재고 증가 메소드
    public void increaseStock(int quantity) {
    	stockQuantity+=quantity;
    }

    // 정보 출력 메소드
    public void show() {
        System.out.println("제품종류 : "+name+", 제품단가 : "+price+", 재고량 : "+stockQuantity);
    }

    @Override
    public String toString() {
        return name+" "+price+" "+stockQuantity;
    }

    // 접근자 메소드
    public String getName() {
    	return name;
    }

    public double getPrice() {
    	return price;
    }
}