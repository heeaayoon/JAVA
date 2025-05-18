package com.ruby.java.ch07.���.ex01;

public class Item { //��ǰ Ŭ����
	private String name; // ��ǰ��
    private double price; // ��ǰ �ܰ�
    private int stockQuantity; // ���

    //������
    public Item(String name, double price, int stockQuantity) {
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
    
    // ��� ���� �޼ҵ�
    public void reduceStock(int quantity) {
    	stockQuantity-=quantity;
    }

    // ��� ���� �޼ҵ�
    public void increaseStock(int quantity) {
    	stockQuantity+=quantity;
    }

    // ���� ��� �޼ҵ�
    public void show() {
        System.out.println("��ǰ���� : "+name+", ��ǰ�ܰ� : "+price+", ��� : "+stockQuantity);
    }

    @Override
    public String toString() {
        return name+" "+price+" "+stockQuantity;
    }

    // ������ �޼ҵ�
    public String getName() {
    	return name;
    }

    public double getPrice() {
    	return price;
    }
}