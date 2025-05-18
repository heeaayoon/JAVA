package com.ruby.java.ch07.���.ex01;

public class Order { //�ֹ� Ŭ����
    private Customer customer; // ��
    private Item[] items; // �ֹ� ��ǰ��
    private int[] quantities; // �ֹ� ��ǰ ������
   // private String []orderDates; //�ֹ���¥
    private int index; //������ ����
    
    //������ 
    public Order(Customer customer, int count) {
		this.customer = customer;
		items= new Item[count];
		quantities = new int[count];
	}

    // ������ �߰� �޼ҵ�
    public void addItem(Item item, int orderQuantity) {
    	if(index<items.length) {
    		items[index]=item;
        	quantities[index] = orderQuantity;
        	index++;
    	}else {
    		System.out.println("�Է°����� �������� ���� �Ѿ����ϴ�.");
    	}
    }

    // �Ѿ� ��� �޼ҵ�
    public double calculateTotal() {
    	double sum = 0.0;
    	for(int i=0;i<items.length;i++) {
    		sum+=items[i].getPrice()*quantities[i];
    	}
    	return sum;
    }

    // �ֹ� ��� ��� �޼ҵ�
    public void printOrderSummary() {
    	System.out.println("----------�ֹ� ��� ����Դϴ�.---------");
    	System.out.println("�ֹ��� : "+customer.getCname());
    	for (int i=0;i<items.length;i++) {
    		System.out.println("������ : "+items[i].getName()+", �ܰ� : "+items[i].getPrice()+", ���� : "+quantities[i]);
    	}
    	System.out.println("�Ѿ� : "+ calculateTotal());
    	System.out.println();

    }
}