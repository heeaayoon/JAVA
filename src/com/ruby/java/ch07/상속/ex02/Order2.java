package com.ruby.java.ch07.���.ex02;

public class Order2 {//�ֹ� Ŭ����
	
	private Customer2 customer; //��
	private Item2[] items; //��ǰ�̸��� �迭
	private int[] quantities; //��ǰ ������ �迭
	private int itemCount; //��ǰ�� ����
	
	//������
	public Order2(Customer2 c, int Count) { //Count �� �� ������ ��ǰ ������ ���� -> ��, Count ũ���� �迭�� �������
		this.customer=c;
		items = new Item2[Count];
		quantities = new int[Count];
	}

	//�������� �߰��ϴ� �޼ҵ�
	public void addItem(Item2 item, int quantity) {
		if(itemCount<items.length) {
			items[itemCount] = item; 
			quantities[itemCount] = quantity;
			itemCount++;
		}else {
			System.out.println("�Է��� �� �ִ� ��ǰ�� ���� ������ ������ϴ�.");
		}
	}
	
	//�Ѿ��� ���ϴ� �޼ҵ�
	public double calculateTotal() {
		double sum = 0.0;
		for(int i=0;i<itemCount;i++) {
			sum += items[i].getPrice()*quantities[i];
		}
		return sum;
	}
	
	//�� ���ξ��� ���ϴ� �޼ҵ�
	public double calculateDiscountedTotal() {
		return customer.applyDiscount(calculateTotal());
	}
	
	//���ε� ���������� ������ �ֹ� ��� �޼ҵ�
	public void printOrderSummary() {
		System.out.println("�ֹ��� : "+customer.getCname());
		for (int i=0;i<itemCount;i++) {
			System.out.println("�ֹ� ��ǰ�� : "+items[i].getName()+", �ܰ� : "+items[i].getPrice()+", �ֹ����� : "+quantities[i]);
		}
		System.out.println("�Ѿ� : "+calculateTotal());
		System.out.println("�� ���ξ� : "+calculateDiscountedTotal());
		System.out.println("�����ݾ� : "+(calculateTotal()-calculateDiscountedTotal()));
		System.out.println();
	}
}
