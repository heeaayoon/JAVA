package com.ruby.java.ch07.상속;

public class Order3 extends SeasonalDiscount {
	private final int N = 20;
	private Customer3 customer; // 고객명
	private Item3[] items = new Item3[0]; // 주문 제품들
	private int[] quantities = new int[0]; // 주문 제품 수량들
	private String[] orderDates = new String[0]; // 주문일자들
	private static int count = 0;
	double total;

	// 생성자
	public Order3(Customer3 customer) {
		this.customer = customer;
	}

	// 주문을 추가하는 메소드
	public void addItem(Item3 item, int quantity, String date) {
		Item3[] newItems = new Item3[items.length + 1];
		System.arraycopy(items, 0, newItems, 0, items.length);
		newItems[newItems.length-1] = item;
		items = newItems;

		int[] newQuantities = new int[quantities.length + 1];
		System.arraycopy(quantities, 0, newQuantities, 0, quantities.length);
		newQuantities[newQuantities.length-1] = quantity;
		quantities = newQuantities;

		String[] newOrderDates = new String[orderDates.length + 1];
		System.arraycopy(orderDates, 0, newOrderDates, 0, orderDates.length);
		newOrderDates[newOrderDates.length-1] = date;
		orderDates = newOrderDates;

	}

	//전체 금액을 출력
	public double calculateTotal() {
		for (int i = 0; i < items.length; i++) {
			total += items[i].getPrice() * quantities[i];
		}
		return total;
	}

	// 고객 할인되는 금액 출력
	public double calculateDiscountedTotal() {
		return customer.applyDiscount(total);
	}
	
	// 시즌 할인되는 금액 출력
	public double seasonalDiscountedTotal() {
		return getPlusDiscountedPrice(total);
	}

	// 전체 내용(할인 내역을 포함)을 출력하는 메소드
	public void printDiscountDetails() {
		System.out.println("총액 : " + calculateTotal());
		System.out.println("할인되는 가격 : " + calculateDiscountedTotal() + seasonalDiscountedTotal());
		System.out.println("최종 할인된 가격 : " + (calculateTotal() - calculateDiscountedTotal()));
	}
}
