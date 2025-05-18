package com.ruby.java.ch07.상속.ex02;

public class ex02_main {

	public static void main(String[] args) {
		// 의류 및 전자제품 생성
		Item2 laptop = new Electronics2("노트북", 1200.00, 10, 24);
		Electronics2 phone = new Electronics2("휴대폰", 800.00, 30, 12);
		Clothing2 tshirt = new Clothing2("티셔츠", 20.00, 50, "M", "Blue");
		Clothing2 jacket = new Clothing2("자켓", 80.00, 20, "L", "Black");

		// 고객 생성
		PremiumCustomer2 premiumCustomer = new PremiumCustomer2("홍길동", "부산", 30);
		RegularCustomer2 regularCustomer = new RegularCustomer2("계백", "양산", 25);

		// 주문 생성
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

		// 주문 요약 출력
		System.out.println("Premium Customer Order:");
		o1.printOrderSummary();
				
		System.out.println("Regular Customer Order:");
		o2.printOrderSummary();
			}
}
