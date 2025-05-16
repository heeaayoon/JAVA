package com.ruby.java.ch07.상속;

public class 실습과제_7장_B2_클래스상속 {

	public static void main(String[] args) {
		// 의류 및 전자제품 생성
		Item2 laptop = new Electronics("노트북", 1200.00, 10, 24);
		Electronics phone = new Electronics("휴대폰", 800.00, 30, 12);
		Clothing tshirt = new Clothing("티셔츠", 20.00, 50, "M", "Blue");
		Clothing jacket = new Clothing("자켓", 80.00, 20, "L", "Black");

		// 고객 생성
		PremiumCustomer premiumCustomer = new PremiumCustomer("홍길동", "부산", 30);
		RegularCustomer regularCustomer = new RegularCustomer("계백", "양산", 25);

		// 주문 생성
		Order2 order1 = new Order2(premiumCustomer, 4); //최대 4개 아이템
		order1.addItem(laptop, 1);
		order1.addItem(tshirt, 2);
		//System.out.println("order1의 총 금액 : "+order1.calculateTotal()+"$");
		//System.out.println("order1의 할인액 : "+order1.calculateDiscountedTotal()+"$");

		Order2 order2 = new Order2(regularCustomer, 4);
		order2.addItem(phone, 1);
		order2.addItem(jacket, 1);
		//System.out.println("order2의 총 금액 : "+order2.calculateTotal()+"$");
		//System.out.println("order2의 할인액 : "+order2.calculateDiscountedTotal()+"$");

		// 주문 요약 출력
		System.out.println("------Premium Customer Order------");
		order1.printOrderSummary();

		System.out.println("------Regular Customer Order------");
		order2.printOrderSummary();

	}

}
