package com.ruby.java.ch07.상속.ex01;

public class Order { //주문 클래스
    private Customer customer; // 고객
    private Item[] items; // 주문 제품들
    private int[] quantities; // 주문 제품 수량들
   // private String []orderDates; //주문날짜
    private int index; //아이템 순번
    
    //생성자 
    public Order(Customer customer, int count) {
		this.customer = customer;
		items= new Item[count];
		quantities = new int[count];
	}

    // 아이템 추가 메소드
    public void addItem(Item item, int orderQuantity) {
    	if(index<items.length) {
    		items[index]=item;
        	quantities[index] = orderQuantity;
        	index++;
    	}else {
    		System.out.println("입력가능한 아이템의 수를 넘었습니다.");
    	}
    }

    // 총액 계산 메소드
    public double calculateTotal() {
    	double sum = 0.0;
    	for(int i=0;i<items.length;i++) {
    		sum+=items[i].getPrice()*quantities[i];
    	}
    	return sum;
    }

    // 주문 요약 출력 메소드
    public void printOrderSummary() {
    	System.out.println("----------주문 요약 출력입니다.---------");
    	System.out.println("주문자 : "+customer.getCname());
    	for (int i=0;i<items.length;i++) {
    		System.out.println("아이템 : "+items[i].getName()+", 단가 : "+items[i].getPrice()+", 수량 : "+quantities[i]);
    	}
    	System.out.println("총액 : "+ calculateTotal());
    	System.out.println();

    }
}