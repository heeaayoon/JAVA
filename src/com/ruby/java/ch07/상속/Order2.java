package com.ruby.java.ch07.상속;

public class Order2 {
	private Customer2 customer;
	private Item2[] items = new Item2[0];
	private int[] quantities = new int[0];
	private int itemCount;
	double total;
	double discountTotal;

	//생성자
	public Order2(Customer2 customer, int count) {
		this.customer = customer;
		this.itemCount = count;
	}

	public void addItem(Item2 item, int quantity) {
		Item2[] newItems = new Item2[items.length + 1];
		System.arraycopy(items, 0, newItems, 0, items.length);
		newItems[newItems.length - 1] = item;
		items = newItems;

		int[] newQuantities = new int[quantities.length + 1];
		System.arraycopy(quantities, 0, newQuantities, 0, quantities.length);
		newQuantities[newQuantities.length - 1] = quantity;
		quantities = newQuantities;
	}
	
	//총 금액 출력
	public double calculateTotal() {
		for(int i=0;i<items.length;i++) {
			total += items[i].getPrice()*quantities[i];
		}
		return total;
	}
	
	//할인되는 금액 출력
	public double calculateDiscountedTotal() {
		return customer.applyDiscount(total);
	}

	// 할인된 가격의 합계 출력
	public void printOrderSummary() {
		System.out.println("총액 : "+ calculateTotal());
		System.out.println("할인되는 가격 : "+ calculateDiscountedTotal());
		System.out.println("최종 할인된 가격 : "+ (calculateTotal()-calculateDiscountedTotal()));
	}
}
