package com.ruby.java.ch07.���.ex03;

public class Clothing3 extends Item3 {
	
	//�ʵ� 
	int size;


	//������ 
	public Clothing3(String name, double price, int stockQuantity, int size) {
		super(name, price, stockQuantity);
		this.size = size;
		}
		
	@Override
	public void show() {
		System.out.println("��ǰ���� : "+getName()+", ��ǰ�ܰ� : "+getPrice()+", ��� : "+getStockQuantity()+", ������ : "+size);
	}
}