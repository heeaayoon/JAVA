package com.ruby.java.ch07.���.ex03;

abstract class Item3 {
	private String name; // ��ǰ��
	private double price; // ��ǰ ����
	private int stockQuantity; // ���
	
	//������
	public Item3(String name,double price, int stockQuantity ) {
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
	
	
	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	//��� �޼ҵ�
	public void show() {
		System.out.println("��ǰ���� : "+name+", ��ǰ�ܰ� : "+price+", ��� : "+stockQuantity);
    }
}