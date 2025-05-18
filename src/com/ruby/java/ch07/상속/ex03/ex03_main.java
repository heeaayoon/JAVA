package com.ruby.java.ch07.���.ex03;

import java.util.Scanner;

public class ex03_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ���Դϱ�? : ");
		double rate = sc.nextDouble();
	
		// �迭�� ������ǰ�� �Ƿ��м� ��ü �߰�
		Item3 note = new Electronics3("��Ʈ��", 1500, 24, 2023);
		Item3 clothe = new Clothing3("Ƽ����", 50, 50, 95);

		// �� ����
		Customer3 regularCustomer = new RegularCustomer3("ȫ�浿");
		Customer3 premiumCustomer = new PremiumCustomer3("������");

		// �ֹ� ���� �� ��� (RegularCustomer)
		Order3 regularOrder = new Order3(rate, regularCustomer);
		regularOrder.addItem(note, 1, "240901");
		regularOrder.addItem(clothe, 2, "240902");
		regularOrder.printOrderSummary();

		// �ֹ� ���� �� ��� (PremiumCustomer)
		Order3 premiumOrder = new Order3(rate, premiumCustomer);
		premiumOrder.addItem(note, 1, "240901");
		premiumOrder.addItem(clothe, 2, "240903");
		premiumOrder.printOrderSummary();
	}
}