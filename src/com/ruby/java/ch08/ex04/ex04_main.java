package com.ruby.java.ch08.ex04;

public class ex04_main {
	
	static void showItemsStock(Item[] items) {
		// 모든 아이템의 이름과 재고량, 가격 출력
		for (Item item : items) {
			item.show(); // 동적 바인딩에 의해 각 클래스의 show() 메서드가 호출됨
		}
	}

	public static void main(String[] args) {
		// Item 타입의 배열 생성
		Item[] items = new Item[4];

		// 배열에 전자제품과 의류패션 객체 추가
		items[0] = new Electronics("노트북", 1500, 100, 2023);
		items[1] = new Clothing("티셔츠", 50, 100, 95);
		items[2] = new Electronics("휴대폰", 800, 100, 2024);
		items[3] = new Clothing("청바지", 80, 100, 90);

		// 모든 아이템의 이름과 재고량,가격 출력
		showItemsStock(items);
		System.out.println();

		// 고객 생성
		Customer regularCustomer = new RegularCustomer("홍길동");
		Customer premiumCustomer = new PremiumCustomer("강감찬");

		// 주문 생성 및 계산 (RegularCustomer)
		Order regularOrder = new Order(regularCustomer);
		regularOrder.addItem(items[0], 1, "240901");
		regularOrder.addItem(items[1], 2, "240902");

		regularOrder.printDiscountDetails(); // 주문 요약 출력

		// 주문 생성 및 계산 (PremiumCustomer)
		Order premiumOrder = new Order(premiumCustomer);
		premiumOrder.addItem(items[1], 1, "240901");
		premiumOrder.addItem(items[3], 2, "240903");

		premiumOrder.printDiscountDetails(); // 주문 요약 출력

		// 모든 아이템의 이름과 감소한 재고량, 가격 출력
		showItemsStock(items);
	}
}