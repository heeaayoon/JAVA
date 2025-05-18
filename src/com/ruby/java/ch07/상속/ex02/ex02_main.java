package com.ruby.java.ch07.���.ex02;

public class ex02_main {

	public static void main(String[] args) {
		// �Ƿ� �� ������ǰ ����
		Item2 laptop = new Electronics2("��Ʈ��", 1200.00, 10, 24);
		Electronics2 phone = new Electronics2("�޴���", 800.00, 30, 12);
		Clothing2 tshirt = new Clothing2("Ƽ����", 20.00, 50, "M", "Blue");
		Clothing2 jacket = new Clothing2("����", 80.00, 20, "L", "Black");

		// �� ����
		PremiumCustomer2 premiumCustomer = new PremiumCustomer2("ȫ�浿", "�λ�", 30);
		RegularCustomer2 regularCustomer = new RegularCustomer2("���", "���", 25);

		// �ֹ� ����
		Order2 o1 = new Order2(premiumCustomer, 4);
		o1.addItem(laptop, 1);
		o1.addItem(tshirt, 2);
		//o1.addItem(tshirt, 2);
		//o1.addItem(tshirt, 2);

		Order2 o2 = new Order2(regularCustomer, 4);
		o2.addItem(phone, 1);
		o2.addItem(jacket, 1);
		//o2.addItem(jacket, 1);
		//o2.addItem(jacket, 1);

		// �ֹ� ��� ���
		System.out.println("Premium Customer Order:");
		o1.printOrderSummary();
				
		System.out.println("Regular Customer Order:");
		o2.printOrderSummary();
			}
}
