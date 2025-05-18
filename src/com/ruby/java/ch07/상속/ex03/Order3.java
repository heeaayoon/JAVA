package com.ruby.java.ch07.상속.ex03;

public class Order3 extends SeasonalDiscount3{
	
	private final int N = 20; //상수
	private Customer3 customer; // 고객
	private Item3[] items; // 주문 제품 배열
	private int[] quantities; // 주문 제품 수량 배열
	private String[] orderDates; // 주문일자 배열
	private int count = 0;
	private double rate; //시즌할인율

	//생성자 //이번엔 촘 제품 종류의 수량이 안 정해져 있음.
	public Order3(double r, Customer3 c) {
		super(r);
		this.customer=c;
		items = new Item3[N];
		quantities = new int[N];
		orderDates = new String[N];
		this.rate = r;
	}
	
	//제품을 추가하는 메소드
	public void addItem(Item3 item, int quantity, String date) {
		if (count<items.length) {
			items[count] = item;
			quantities[count] = quantity;
			orderDates[count] = date;
			count++;
		}
	}
	
	//총액을 출력하는 메소드
	public double calculateTotal() {
		double sum = 0.0;
		for(int i=0;i<count;i++) {
			sum += items[i].getPrice()*quantities[i];
		}
		return sum;
	}
	
	//고객 할인된 금액 메소드
	public double discountedCalculate1() {
		return customer.applyDiscount(calculateTotal());
	}
	
	//할인된 내역 및 할인 최종 금액을 출력하는 메소드
	//단, 일반고객은 시즌 할인이 없고, 프리미엄 고객은 시즌 할인이 추가됨
	public void printOrderSummary() {
		System.out.println("고객명 : "+customer.getName()+", 고객 타입 : "+customer.toString());
		for(int i=0;i<count;i++) {
			System.out.println("주문 제품 : "+items[i].getName()+", 단가 : "+items[i].getPrice()+", 제품 수량 : "+quantities[i]);
		}
		System.out.println("총액 : "+calculateTotal());
		System.out.println("고객할인 금액 : "+discountedCalculate1());
		
		if(customer instanceof PremiumCustomer3) {
			System.out.println("추가 시즌 할인액 : "+ getSeasonalDiscountedPrice(calculateTotal()));
			System.out.println("최종 금액 : "+(calculateTotal()-discountedCalculate1()-getSeasonalDiscountedPrice(calculateTotal())));
		}else {
			System.out.println("추가 시즌 할인이 없습니다.");
			System.out.println("최종 금액 : "+(calculateTotal()-discountedCalculate1()));
		}
	
		System.out.println();
	}
}