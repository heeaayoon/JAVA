package com.ruby.java.ch07.���.ex03;

public class Order3 extends SeasonalDiscount3{
	
	private final int N = 20; //���
	private Customer3 customer; // ��
	private Item3[] items; // �ֹ� ��ǰ �迭
	private int[] quantities; // �ֹ� ��ǰ ���� �迭
	private String[] orderDates; // �ֹ����� �迭
	private int count = 0;
	private double rate; //����������

	//������ //�̹��� �� ��ǰ ������ ������ �� ������ ����.
	public Order3(double r, Customer3 c) {
		super(r);
		this.customer=c;
		items = new Item3[N];
		quantities = new int[N];
		orderDates = new String[N];
		this.rate = r;
	}
	
	//��ǰ�� �߰��ϴ� �޼ҵ�
	public void addItem(Item3 item, int quantity, String date) {
		if (count<items.length) {
			items[count] = item;
			quantities[count] = quantity;
			orderDates[count] = date;
			count++;
		}
	}
	
	//�Ѿ��� ����ϴ� �޼ҵ�
	public double calculateTotal() {
		double sum = 0.0;
		for(int i=0;i<count;i++) {
			sum += items[i].getPrice()*quantities[i];
		}
		return sum;
	}
	
	//�� ���ε� �ݾ� �޼ҵ�
	public double discountedCalculate1() {
		return customer.applyDiscount(calculateTotal());
	}
	
	//���ε� ���� �� ���� ���� �ݾ��� ����ϴ� �޼ҵ�
	//��, �Ϲݰ��� ���� ������ ����, �����̾� ���� ���� ������ �߰���
	public void printOrderSummary() {
		System.out.println("주문자명 :" +customer.getName());
		for(int i=0;i<count;i++) {
			System.out.println("�ֹ� ��ǰ : "+items[i].getName()+", �ܰ� : "+items[i].getPrice()+", ��ǰ ���� : "+quantities[i]);
		}
		System.out.println("�Ѿ� : "+calculateTotal());
		System.out.println("������ �ݾ� : "+discountedCalculate1());
		
		if(customer instanceof PremiumCustomer3) {
			System.out.println("�߰� ���� ���ξ� : "+ getSeasonalDiscountedPrice(calculateTotal()));
			System.out.println("���� �ݾ� : "+(calculateTotal()-discountedCalculate1()-getSeasonalDiscountedPrice(calculateTotal())));
		}else {
			System.out.println("�߰� ���� ������ �����ϴ�.");
			System.out.println("���� �ݾ� : "+(calculateTotal()-discountedCalculate1()));
		}
	
		System.out.println();
	}
}