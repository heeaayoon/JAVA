package com.ruby.java.ch07.���.ex02;

public class Clothing2 extends Item2 {
	private String size;
	private String color;
	
	//������
	public Clothing2(String name,double price, int stockQuantity,String size, String color) {
		super(name, price, stockQuantity);
		this.color=color;
		this.size=size;
	}
	
	//���� ��� �żҵ�
	public void show() {
		System.out.println("��ǰ���� : "+this.getName()+", ��ǰ�ܰ� : "+this.getPrice()+", ��� : "+this.getStockQuantity()+", ������ : "+size+", �÷� : "+color);
	}

	@Override
	public String toString() {
		return "��ǰ���� : "+this.getName()+", ��ǰ�ܰ� : "+this.getPrice()+", ��� : "+this.getStockQuantity()+", ������ : "+size+", �÷� : "+color;
	}
}
