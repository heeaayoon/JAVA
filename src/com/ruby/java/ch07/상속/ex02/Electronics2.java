package com.ruby.java.ch07.���.ex02;

public class Electronics2 extends Item2{
	private int warranty; // ��ǰ ���� �Ⱓ

	//������
		public Electronics2(String name,double price, int stockQuantity,int warranty) {
			super(name, price, stockQuantity);
			this.warranty=warranty;
		}
	
	public void show() {
		System.out.println("��ǰ���� : "+this.getName()+", ��ǰ�ܰ� : "+this.getPrice()+", ��� : "+this.getStockQuantity()+", �����Ⱓ : "+warranty);
	}

	@Override
	public String toString() {
		return "��ǰ���� : "+this.getName()+", ��ǰ�ܰ� : "+this.getPrice()+", ��� : "+this.getStockQuantity()+", �����Ⱓ : "+warranty;
	}
}