package com.ruby.java.ch07.상속;

public class Item {
	
	private String name; // 제품명
    private double price; // 제품 가격
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
    	System.out.println("제품명 : "+name+", 제품가격 : "+price+"$ , 재고량 : "+stockQuantity);
        
    }

    @Override
    public String toString() {
		return "제품명 : "+name+", 제품가격 : "+price+"$ , 재고량 : "+stockQuantity;
    }

    // 접근자 메소드
    public String getName() {
		return name;

    }

    public double getPrice() {
		return price;

    }
}

