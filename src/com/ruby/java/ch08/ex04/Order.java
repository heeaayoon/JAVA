package com.ruby.java.ch08.ex04;

class Order extends SeasonalDiscount {
	private final int N = 20; //최대 주문 수량
	private Customer customer; // 고객명
	private Item[] items; // 주문 제품들
	private int[] quantities; // 주문 제품 수량들
	private String[] orderDates; // 주문일자들
	private int count = 0;

	public Order(Customer c) {
		super(0.02); 
		this.customer = c;
		items = new Item[N];
		quantities = new int[N];
		orderDates = new String[N];
	}
	
	//아이템을 추가하는 메소드
	public void addItem(Item item, int quantity, String date) {
		if(count<items.length) {
			items[count] = item;
			quantities[count] = quantity;
			orderDates[count] = date;
			items[count].reduceStock(quantity);
			count++;
		}
	}
	
	//총액
	public double calculateTotal() {
		double sum = 0.0;
		for(int i=0;i<count;i++) {
			sum += items[i].getPrice()*quantities[i];
		}
		return sum;
	}
	
	//고객할인+시즌할인
	public double discountedCalculate() {
		double discountedSum = customer.applyDiscount(calculateTotal());
		if(customer instanceof PremiumCustomer) {
			discountedSum += geteasonalDiscountedPrice(calculateTotal());
		}		
		return discountedSum;
	}

	//할인된 내역을 포함한 주문 요약을 출력하는 메소드
	public void printDiscountDetails() {
		System.out.println("======주문을 요약합니다=====");
		System.out.println("주문자명 : "+customer.getName()+", 고객 타입 : "+customer.toString());
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.println("상품명 : "+items[i].getName()+", 상품 단가 : "+items[i].getPrice()+", 수량 : "+quantities[i]);
		}
		System.out.println("총액 : "+calculateTotal());
		System.out.println("할인액 : "+discountedCalculate());
		System.out.println("최종 금액 : "+(calculateTotal()-discountedCalculate()));
	
		System.out.println();
	}
}