package com.ruby.java.ch07.���.ex03;

public class Electronics3 extends Item3 {
	
	//�ʵ�
	int madeYear;

	
	//������ 
	public Electronics3(String name, double price, int stockQuantity, int madeYear) {
		super(name, price, stockQuantity);
		this.madeYear = madeYear;
	}
	
	@Override
	public void show() {
		System.out.println("��ǰ���� : "+getName()+", ��ǰ�ܰ� : "+getPrice()+", ��� : "+getStockQuantity()+", ����⵵ : "+madeYear);
	}
}