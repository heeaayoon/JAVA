package com.ruby.java.ch07.상속.ex03;

import java.util.Scanner;

public class ex03_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시즌 할인율은 얼마입니까? : ");
		double rate = sc.nextDouble();
	
		// 배열에 전자제품과 의류패션 객체 추가
		Item3 note = new Electronics3("노트북", 1500, 24, 2023);
		Item3 clothe = new Clothing3("티셔츠", 50, 50, 95);

		// 고객 생성
		Customer3 regularCustomer = new RegularCustomer3("홍길동");
		Customer3 premiumCustomer = new PremiumCustomer3("강감찬");

		// 주문 생성 및 계산 (RegularCustomer)
		Order3 regularOrder = new Order3(rate, regularCustomer);
		regularOrder.addItem(note, 1, "240901");
		regularOrder.addItem(clothe, 2, "240902");
		regularOrder.printOrderSummary();

		// 주문 생성 및 계산 (PremiumCustomer)
		Order3 premiumOrder = new Order3(rate, premiumCustomer);
		premiumOrder.addItem(note, 1, "240901");
		premiumOrder.addItem(clothe, 2, "240903");
		premiumOrder.printOrderSummary();
	}
}