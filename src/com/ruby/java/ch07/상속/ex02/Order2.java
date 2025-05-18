package com.ruby.java.ch07.상속.ex02;

public class Order2 {//주문 클래스
	
	private Customer2 customer; //고객
	private Item2[] items; //상품이름의 배열
	private int[] quantities; //상품 수량의 배열
	private int itemCount; //상품의 종류
	
	//생성자
	public Order2(Customer2 c, int Count) { //Count 는 총 가능한 싱품 종류의 갯수 -> 즉, Count 크기의 배열이 만들어짐
		this.customer=c;
		items = new Item2[Count];
		quantities = new int[Count];
	}

	//아이템을 추가하는 메소드
	public void addItem(Item2 item, int quantity) {
		if(itemCount<items.length) {
			items[itemCount] = item; 
			quantities[itemCount] = quantity;
			itemCount++;
		}else {
			System.out.println("입력할 수 있는 상품의 종류 갯수를 벗어났습니다.");
		}
	}
	
	//총액을 구하는 메소드
	public double calculateTotal() {
		double sum = 0.0;
		for(int i=0;i<itemCount;i++) {
			sum += items[i].getPrice()*quantities[i];
		}
		return sum;
	}
	
	//총 할인액을 구하는 메소드
	public double calculateDiscountedTotal() {
		return customer.applyDiscount(calculateTotal());
	}
	
	//할인된 최종가격을 포함한 주문 요약 메소드
	public void printOrderSummary() {
		System.out.println("주문자 : "+customer.getCname());
		for (int i=0;i<itemCount;i++) {
			System.out.println("주문 상품명 : "+items[i].getName()+", 단가 : "+items[i].getPrice()+", 주문수량 : "+quantities[i]);
		}
		System.out.println("총액 : "+calculateTotal());
		System.out.println("총 할인액 : "+calculateDiscountedTotal());
		System.out.println("최종금액 : "+(calculateTotal()-calculateDiscountedTotal()));
		System.out.println();
	}
}
