package com.ruby.java.ch07.���.ex01;

public class ex01_main {

	public static void main(String[] args) {
	        // ������ ����
	        Item laptop = new Item("��Ʈ��", 1200.00, 10);
	        Item tshirt = new Item("Ƽ����", 20.00, 50);
	        Item phone = new Item("�޴���", 800.00, 30);
	        Item headphones = new Item("�����", 150.00, 20);
	        Item mouse = new Item("���콺", 30.00, 15);
	        // mouse.show();

	        // �� ����
	        Customer boy = new Customer("ȫ�浿", "�λ�", 21);
	        Customer girl = new Customer("���", "���", 22);
	       // girl.show();

	        // �ֹ� ����
	        Order order1 = new Order(boy, 5); // �ִ� 5�� ������
	        order1.addItem(laptop, 1);
	        order1.addItem(tshirt, 2);
	        order1.addItem(phone, 1);
	        order1.addItem(headphones, 1);
	        order1.addItem(mouse, 1);
	       // order1.addItem(mouse, 1); //"�Է°����� �������� ���� �Ѿ����ϴ�."��µ�

	        Order order2 = new Order(girl, 5); // �ִ� 5�� ������
	        order2.addItem(laptop, 1);
	        order2.addItem(tshirt, 1);
	        order2.addItem(phone, 1);
	        order2.addItem(headphones, 1);
	        order2.addItem(mouse, 1);

	        // �ֹ� ��� ���
	        order1.printOrderSummary();
	        order2.printOrderSummary();
	        
	    }
	}